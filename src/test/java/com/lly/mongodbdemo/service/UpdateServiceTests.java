package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateServiceTests {

    @Autowired
    private UpdateService updateService;

    @Test
    public void testUpdate() {
        updateService.update();
    }

    @Test
    public void testUpdateFirst() {
        updateService.updateFirst();
    }

    @Test
    public void testUpdateMany() {
        updateService.updateMany();
    }

}
