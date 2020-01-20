package com.peactor.springbucks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CoffeeController
 * @Description coffee refer controller
 * @Author Ifan
 * @Date 20-1-20
 **/
@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @GetMapping("/test")
    public String test() {
        return "test success";
    }
}
