package com.advance.springboot.kafka.tutorial.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic microservicesSampleTopics() {
        return TopicBuilder.name("Microservices_Sample_Topics")
                .build();
    }

    @Bean
    public NewTopic microservicesJsonSampleTopics() {
        return TopicBuilder.name("Microservices_Json_Sample_Topics")
                .build();
    }
}
