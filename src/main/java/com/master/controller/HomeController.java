package com.master.controller;

import com.master.mybatis.dao.RatesMapper;
import com.master.mybatis.model.Rates;
import com.master.mybatis.model.RatesExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.security.auth.login.CredentialException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    private static final int RATES_COUNT = 10;

    @Autowired
    RatesMapper ratesMapper;

    /**
     * Main view page in project.
     * Creates new row in db after each call.
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHomeForm(ModelMap model, Principal principal) {
        writeDummyRatesToDb(principal);
        List<Rates> ratesList = ratesMapper.selectByExample(lastRates(principal));
        model.addAttribute("ratesList", ratesList.toArray());
        return "home";
    }

    /**
     * Generates random float value in range 10..100
     * TODO: remove after getting real data
     * @return random <code>float</code> value
     */
    private float getRandom(){
        return (float) (10 + Math.random() * 90);
    }

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
