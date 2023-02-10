package com.toyproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Contoller
 * */
@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> index(){
        ResponseEntity<String> res = new ResponseEntity<String>("hello!", HttpStatus.OK);
        return res;
    }

}
