package com.bellcow.springbootkafkaconsumer.listener;

import com.bellcow.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "TestTopic", groupId = "group_id")
    public void consume(String message){
        System.out.println("Message : "+ message);
    }

    @KafkaListener(topics = "TestTopic", groupId = "group_json")
    public void consumeJson(User user){
        System.out.println("JsonMessage "+ user);
    }
}
