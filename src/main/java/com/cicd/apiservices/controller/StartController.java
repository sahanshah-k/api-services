package com.cicd.apiservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class StartController {

    @GetMapping(value = "test")
    public ResponseEntity<?> getData() {
        return new ResponseEntity<>("{\"message\":\"Working!!!!!\"}", HttpStatus.OK);
    }

}
