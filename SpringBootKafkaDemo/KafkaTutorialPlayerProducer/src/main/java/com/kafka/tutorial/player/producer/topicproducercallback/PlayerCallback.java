package com.kafka.tutorial.player.producer.topicproducercallback;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class PlayerCallback implements Callback {


    @Override
    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
        System.out.println("Partition : " + recordMetadata.partition());
        System.out.println("Offset : " + recordMetadata.offset());
        System.out.println("Message Sent Successfully : " + recordMetadata.topic());
        if (e != null) {
            e.printStackTrace();
        }
    }
}
