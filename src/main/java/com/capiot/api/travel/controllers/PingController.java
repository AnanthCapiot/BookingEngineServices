package com.capiot.api.travel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PingController {
    @GetMapping(value = "/ping", produces = "application/json")
    public String pingService() {
        return "{\"ping\":\"OK\"}";
    }
}
