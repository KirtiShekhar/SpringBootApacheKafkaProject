package com.advance.springboot.kafka.tutorial.kafkaProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaTutorialProducer {
    private static final Logger kafkaProducerLogger = LoggerFactory.getLogger(KafkaTutorialProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendTopicMessage(String topicMessage) {
        kafkaProducerLogger.info(String.format("Topic Message Sent %s", topicMessage));
        kafkaTemplate.send("Microservices_Sample_Topics", topicMessage);
    }
}
