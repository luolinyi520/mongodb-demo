package com.lly.mongodbdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;

/**
 * 配置事务管理器
 * 注意：单节点 mongodb 不支持事务，需要搭建 MongoDB 复制集。
 *
 */
@Configuration
public class TransactionConfig {

    @Bean
    MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }

}

