package com.ersurajrajput.kishan_setu.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {
    @GetMapping
    public String health(){
        return "server is running";
    }

//    @GetMapping
//    public String test(
//            @RequestParam(defaultValue = "10") int size
//    ){
//        return String.valueOf(size);
//    }
}
