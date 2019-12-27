package com.hongjun423.toy_project.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hongjun423.toy_project.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    ObjectMapper mapper = new ObjectMapper();

    {
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    @GetMapping("/")
    public String main() throws JsonProcessingException {
        Student student = new Student();
        log.info("main page in");
        log.info("{}", mapper.writeValueAsString(student));
        return "main page";
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello!!";
    }
}
