package com.mundo_latino.controller;

import com.mundo_latino.address.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

//    @GetMapping("/")
//    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
//        return String.format("Hello %s!", name);
//    }
    @GetMapping("/")
    public List<Address> addresses(){
        return List.of(new Address(1L,"testAddress", 48149));
    }
}