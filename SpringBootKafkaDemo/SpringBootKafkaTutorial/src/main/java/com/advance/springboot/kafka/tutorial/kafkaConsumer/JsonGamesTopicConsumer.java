package com.advance.springboot.kafka.tutorial.kafkaConsumer;

import com.advance.springboot.kafka.tutorial.payload.GamesTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonGamesTopicConsumer {
    private static final Logger jsonKafkaConsumerLogger = LoggerFactory.getLogger(JsonGamesTopicConsumer.class);

    @KafkaListener(topics = "Microservices_Json_Sample_Topics", groupId = "kafkaTut")
    public void consumeGamesTopicMessage(GamesTopic gamesTopicJsonMessage) {
        jsonKafkaConsumerLogger.info(String.format("Games Topic Json Message Received %s", gamesTopicJsonMessage));
    }
}
