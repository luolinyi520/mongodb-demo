package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SaveServiceTests {

    @Autowired
    private SaveService saveService;

    @Test
    public void testSave() {
        saveService.save();
    }

}
