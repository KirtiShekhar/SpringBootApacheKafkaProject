package com.advance.springboot.kafka.tutorial.controller;

import com.advance.springboot.kafka.tutorial.kafkaProducer.JsonGamesTopicProducer;
import com.advance.springboot.kafka.tutorial.payload.GamesTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/gamesTopic")
public class KafkaTutorialControllerController {
    @Autowired
    private JsonGamesTopicProducer jsonGamesTopicProducer;

    @PostMapping("publish/GamesTopic")
    public ResponseEntity<String> publishTopicMessage(@RequestBody GamesTopic gamesTopic) {
        jsonGamesTopicProducer.sendGamesTopicMessage(gamesTopic);
        return new ResponseEntity<>(String.format("Json Games Topic Message Sent %s", gamesTopic), HttpStatus.CREATED);
    }
}
