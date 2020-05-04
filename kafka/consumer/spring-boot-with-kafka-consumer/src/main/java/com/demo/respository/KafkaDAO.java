package com.demo.respository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.KafkaConsumedMessage;

public interface KafkaDAO extends CrudRepository<KafkaConsumedMessage, Integer> {

}
