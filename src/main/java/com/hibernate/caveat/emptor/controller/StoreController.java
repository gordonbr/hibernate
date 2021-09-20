package com.hibernate.caveat.emptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @GetMapping("/customer")
    public String getCustomer() {
        return "test customer";
    }
}
