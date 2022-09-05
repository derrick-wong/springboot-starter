package com.chefcode.starter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/info")
    public ResponseEntity<?> getSampleInfo() {
        return ResponseEntity.ok("Sample info");
    }
}
