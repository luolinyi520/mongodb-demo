package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateCollectionServiceTests {

    @Autowired
    private CreateCollectionService createCollectionService;

    @Test
    public void testCreateCollection() {
        System.out.println(createCollectionService.createCollection());
    }

}
