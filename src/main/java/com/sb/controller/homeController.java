package com.sb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class homeController {
    private final com.sb.service.homeService homeService;

    @GetMapping(value = "/hello")
    public String hello(){
        return homeService.name();
    }
}
