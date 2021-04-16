package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemoveServiceTests {

    @Autowired
    private RemoveService removeService;

    @Test
    public void testRemove() {
        removeService.remove();
    }

    @Test
    public void testFindAndRemove() {
        removeService.findAndRemove();
    }

    @Test
    public void testFindAllAndRemove() {
        removeService.findAllAndRemove();
    }

}
