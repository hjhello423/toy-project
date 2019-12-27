package com.hongjun423.toy_project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @GetMapping("/")
    public String main() {
        log.info("main page in");
        return "main page";
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello!!";
    }
}
