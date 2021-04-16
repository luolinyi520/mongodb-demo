package com.lly.mongodbdemo.controller;

import com.lly.mongodbdemo.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SaveService saveService;

    @RequestMapping("/save")
    public String save() {
        saveService.save();
        return "success";
    }

}
