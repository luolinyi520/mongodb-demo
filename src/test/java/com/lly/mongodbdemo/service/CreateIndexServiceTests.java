package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateIndexServiceTests {

    @Autowired
    private CreateIndexService createIndexService;

    @Test
    public void testCreateAscendingIndex() {
        createIndexService.createAscendingIndex();
    }

    @Test
    public void testCreateDescendingIndex() {
        System.out.println(createIndexService.createDescendingIndex());
    }

}
