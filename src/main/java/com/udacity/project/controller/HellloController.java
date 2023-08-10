package com.udacity.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/udacity")
public class HellloController {

    @GetMapping(path = "/project5")
    public String hello() {
        return "Hello world";
    }
}
