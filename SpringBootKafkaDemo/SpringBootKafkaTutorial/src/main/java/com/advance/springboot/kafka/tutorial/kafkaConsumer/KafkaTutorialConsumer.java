package com.advance.springboot.kafka.tutorial.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaTutorialConsumer {
    private static final Logger kafkaConsumerLogger = LoggerFactory.getLogger(KafkaTutorialConsumer.class);

    @KafkaListener(topics = "Microservices_Sample_Topics", groupId = "kafkaTut")
    public void consumeTopicMessage(String topicMessage) {
        kafkaConsumerLogger.info(String.format("Topic Message Received %s", topicMessage));
    }
}
