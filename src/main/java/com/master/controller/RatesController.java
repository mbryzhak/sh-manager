package com.master.controller;

import com.master.form.RatesForm;
import com.master.helper.JsonHelper;
import com.master.mybatis.dao.RatesMapper;
import com.master.mybatis.model.Rates;
import com.master.mybatis.model.RatesExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.net.httpserver.HttpServerImpl;

import java.security.Principal;
import java.util.Date;
import java.util.List;

@Controller
public class RatesController {

    private static final Logger LOGGER = Logger.getLogger(RatesController.class);

    private static final int RATES_COUNT = 10;

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
        List<Rates> ratesList = ratesMapper.selectByExample(lastRates(principal));
        model.addAttribute("ratesList", ratesList.toArray());
        return "rates";
    }

    /**
     * Update rates. Will update all rates if no rateNumber specified
     * @param rateNumber
     */
    @RequestMapping(value = "/updateRates", method = RequestMethod.POST)
    public ResponseEntity updateAllRates(@RequestParam("rateNumber") String rateNumber,
                                         @RequestParam("requestJson") String newRates){
        LOGGER.debug(String.format("New rateNumber to be set: %s", rateNumber));
        RatesForm rates = JsonHelper.get(newRates, RatesForm.class);
        LOGGER.debug(String.format("New rate configs:\n%s", rates.toString()));
        if(rates == null) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<String>(HttpStatus.ACCEPTED);
        }
    }

    /**
     * Generates random float value in range 10..100
     * TODO: remove after getting real data
     * @return random <code>float</code> value
     */
    private float getRandom(){
        return (float) (10 + Math.random() * 90);
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
    private RatesExample lastRates(Principal principal){
        RatesExample example = new RatesExample();
        example.createCriteria().andUsernameEqualTo(principal.getName());
        example.setOrderByClause("datetime desc limit " + RATES_COUNT);
        return example;
    }
}
