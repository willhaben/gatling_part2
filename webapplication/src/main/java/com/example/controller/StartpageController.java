package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class StartpageController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String home(){
        return "Ok";
    }
}
