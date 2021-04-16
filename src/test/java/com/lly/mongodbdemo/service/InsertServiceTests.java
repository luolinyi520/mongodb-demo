package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertServiceTests {

    @Autowired
    private InsertService insertService;

    @Test
    public void testInsert() {
        insertService.insert();
    }

    @Test
    public void testInsertMany() {
        insertService.insertMany();
    }

}
