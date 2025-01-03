package com.demo.springboot.learn_springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;


//courses
//build the rest api

//    [
//            {
//            "id" : 1,
//            "name": "Learn AWS",
//            "author": "in28minutes"
//            }
//            ]
@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

        @RequestMapping("/currency-configuration")
        public CurrencyServiceConfiguration retrieveAllCourses(){
            return configuration;
        }




}
