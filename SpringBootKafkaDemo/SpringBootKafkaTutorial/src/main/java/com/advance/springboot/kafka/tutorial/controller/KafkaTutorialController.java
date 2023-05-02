package com.advance.springboot.kafka.tutorial.controller;

import com.advance.springboot.kafka.tutorial.kafkaProducer.KafkaTutorialProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/topic")
public class KafkaTutorialController {
    @Autowired
    private KafkaTutorialProducer kafkaTutorialProducer;

    @GetMapping("publish")
    public ResponseEntity<String> publishTopicMessage(@RequestParam("topicMessage") String topicMessage) {
        kafkaTutorialProducer.sendTopicMessage(topicMessage);
        return new ResponseEntity<>(String.format("Topic Message Sent %s", topicMessage), HttpStatus.OK);
    }
}
