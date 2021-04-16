package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueryServiceTests {

    @Autowired
    private QueryService queryService;

    @Test
    public void testFindAll() {
        queryService.findAll();
    }

    @Test
    public void testFindById() {
        queryService.findById();
    }

    @Test
    public void testFindOne() {
        queryService.findOne();
    }

    @Test
    public void testFindByCondition() {
        queryService.findByCondition();
    }

}
