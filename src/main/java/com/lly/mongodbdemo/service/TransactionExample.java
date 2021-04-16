package com.lly.mongodbdemo.service;

import com.lly.mongodbdemo.entity.Status;
import com.lly.mongodbdemo.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Date;

@Service
public class TransactionExample {

    /** 设置集合名称 */
    private static final String COLLECTION_NAME = "users";

    @Resource
    private MongoTemplate mongoTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void transactionTest(){
        // 设置两个用户信息
        User user1 = new User()
                .setId("55")
                .setAge(22)
                .setSex("男")
                .setRemake("无")
                .setSalary(1500)
                .setName("error11")
                .setBirthday(new Date())
                .setStatus(new Status().setHeight(180).setWeight(150));

//        User user2 = new User()
//                .setId("66")
//                .setAge(22)
//                .setSex("男")
//                .setRemake("无")
//                .setSalary(1500)
//                .setName("error22")
//                .setBirthday(new Date())
//                .setStatus(new Status().setHeight(180).setWeight(150));
        // 插入数据
        User newUser1 = mongoTemplate.insert(user1, COLLECTION_NAME);

        // 抛出异常，观察数据是否进行回滚
        int error = 1/0;

//        User newUser2 = mongoTemplate.insert(user2, COLLECTION_NAME);
    }

}

