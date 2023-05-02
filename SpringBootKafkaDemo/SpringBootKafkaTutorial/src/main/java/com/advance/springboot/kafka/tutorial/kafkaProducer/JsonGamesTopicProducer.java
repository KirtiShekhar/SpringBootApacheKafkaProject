package com.advance.springboot.kafka.tutorial.kafkaProducer;

import com.advance.springboot.kafka.tutorial.payload.GamesTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonGamesTopicProducer {
    private static final Logger jsonKafkaProducerLogger = LoggerFactory.getLogger(JsonGamesTopicProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendGamesTopicMessage(GamesTopic gamesTopicMessage) {
        jsonKafkaProducerLogger.info(String.format("Games Topic Message Sent %s", gamesTopicMessage));
        Message<GamesTopic> gamesTopicMessages = MessageBuilder
                .withPayload(gamesTopicMessage)
                .setHeader(KafkaHeaders.TOPIC, "Microservices_Json_Sample_Topics")
                .build();
        kafkaTemplate.send(gamesTopicMessages);
    }
}
