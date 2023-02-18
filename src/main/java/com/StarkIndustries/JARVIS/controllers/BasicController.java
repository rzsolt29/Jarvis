package com.StarkIndustries.JARVIS.controllers;

import java.time.Instant;
import java.time.ZoneId;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
    private final Logger logger = LoggerFactory.getLogger(BasicController.class);


    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("today", Instant.now().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek());
        return modelAndView;
    }

}
