package com.advertisement.infrastructure;

import com.advertisement.application.AdController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advertisement/api")
public class RestAdController implements AdController {

    @Override
    @GetMapping(value = "/{productName}")
    public String giveAdvertisement(@PathVariable String productName) {
        return "We gave an Advertisement for " + productName;
    }

    @GetMapping(value = "/productName")
    public String giveAdvertisementAnother() {
        return "You gave an Advertisement for -> ";
    }
}
