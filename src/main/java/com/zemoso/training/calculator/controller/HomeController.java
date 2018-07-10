package com.zemoso.training.calculator.controller;

import com.zemoso.training.calculator.datasource.Message;
import com.zemoso.training.calculator.utils.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = Constants.MAPPINGS.BASE_URL)
public class HomeController {

    @GetMapping
    public Message getHomeMessage(){
        return new Message("Welcome to calculator application");
    }

}
