package com.master.controller;

import com.master.form.RatesForm;
import com.master.helper.JsonHelper;
import com.master.mybatis.dao.RatesMapper;
import com.master.mybatis.model.Rates;
import com.master.mybatis.model.RatesExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.List;

@Controller
public class RatesController {

    private static final Logger LOGGER = Logger.getLogger(RatesController.class);

    private static final int RATES_COUNT = 10;
    private static final int RATES_COUNT_LARGE = 50;

    @Autowired
    RatesMapper ratesMapper;

    /**
     * Display rates page with last <code>RATES_COUNT</code> rate values in table
     * Creates new row in db after each call.
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/rates", method = RequestMethod.GET)
    public String viewHomeForm(ModelMap model, Principal principal) {
        writeDummyRatesToDb(principal);
        List<Rates> ratesList = ratesMapper.selectByExample(lastRates(principal, RATES_COUNT));
        List<Rates> ratesListLarge = ratesMapper.selectByExample(lastRates(principal, RATES_COUNT_LARGE));
        model.addAttribute("ratesList", ratesList.toArray());
        model.addAttribute("ratesListLarge", ratesListLarge.toArray());
        return "rates";
    }

    /**
     * Update rates. Will update all rates if no rateNumber specified
     * @param rateNumber
     */
    @RequestMapping(value = "/updateRates", method = RequestMethod.POST)
    public void updateAllRates(@RequestParam("rateNumber") String rateNumber,
                                         @RequestParam("requestJson") String newRates,
                                         HttpServletResponse response) throws IOException {
        LOGGER.debug(String.format("New rateNumber to be set: %s", rateNumber));
        RatesForm rates = JsonHelper.get(newRates, RatesForm.class);
        if(rates == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
            LOGGER.debug(String.format("New rate configs: %s", rates.toString()));
        }
    }

    /**
     * Generates random float value in range 10..500
     * TODO: remove after getting real data
     * @return random <code>float</code> value
     */
    private float getRandom(){
        return (float) (10 + Math.random() * 50);
    }

    /**
     * Temporary method for creating rate values
     * TODO: remove after getting real data
     * @param principal
     */
    private void writeDummyRatesToDb(Principal principal){
        Rates rates = new Rates();
        rates.setUsername(principal.getName());
        rates.setDateTime(new Date());
        rates.setSensor1(getRandom());
        rates.setSensor2(getRandom());
        rates.setSensor3(getRandom());
        rates.setSensor4(getRandom());
        rates.setSensor5(getRandom());
        ratesMapper.insert(rates);
    }

    /**
     * Create example for ratesMapper to queue db for a last <code>RATES_COUNT</code> rows
     * @param principal
     * @return example
     */
    private RatesExample lastRates(Principal principal, int count){
        RatesExample example = new RatesExample();
        example.createCriteria().andUsernameEqualTo(principal.getName());
        example.setOrderByClause("datetime desc limit " + count);
        return example;
    }
}
