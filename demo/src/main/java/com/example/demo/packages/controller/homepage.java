package com.example.demo.packages.controller;

import com.example.demo.packages.model.data;
import com.example.demo.packages.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class homepage {
    @Autowired
    public service s;
    public homepage(service s){
        this.s=s;
    }
    @PostMapping("/sendmail")
    public ResponseEntity<String> send (@RequestBody data dts) {
        s.sendEmail(dts);
        return ResponseEntity.ok("Email submitted successfully");
        }
}
