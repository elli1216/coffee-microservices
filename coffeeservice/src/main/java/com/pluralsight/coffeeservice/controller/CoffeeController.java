package com.pluralsight.coffeeservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@RestController
public class CoffeeController {

    @Value("${coffee.recommendation}")
    private String recommendedCoffee;

    @GetMapping("/coffee")
    public String getCoffee() {
        return "double espresso";
    }
}
