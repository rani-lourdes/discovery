package com.demo.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.model.KafkaConsumedMessage;
import com.demo.respository.KafkaDAO;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    
    @Autowired
    KafkaDAO  kafkaDao;

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
    	KafkaConsumedMessage m=new KafkaConsumedMessage();
    	m.setMessage(message);
    	kafkaDao.save(m);
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
