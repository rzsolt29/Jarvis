package com.StarkIndustries.JARVIS.controllers;

import org.springframework.stereotype.Controller;

import java.time.Instant;
import java.time.ZoneId;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    private final Logger logger = LoggerFactory.getLogger(FormController.class);


    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("today", Instant.now().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek());
        return modelAndView;
    }

    @GetMapping("/user")
    public ModelAndView user(){
        logger.debug("request to GET user");
        ModelAndView modelAndView = new ModelAndView("user");
        return modelAndView;
    }
}
