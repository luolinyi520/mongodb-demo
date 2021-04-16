package com.lly.mongodbdemo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionExampleTests {

    @Autowired
    private TransactionExample transactionExample;

    @Test
    public void transactionTest() {
        transactionExample.transactionTest();
    }

}
