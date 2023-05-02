package com.kafka.tutorial.player.consumer.topicconsumer;

import com.kafka.tutorial.player.consumer.modal.Player;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class PlayerConsumer {
    public static void main(String[] args) {
        Properties kafkaProperties = new Properties();
        kafkaProperties.setProperty("bootstrap.servers", "localhost:9092");
        kafkaProperties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        kafkaProperties.setProperty("value.deserializer", "com.kafka.tutorial.player.consumer.modaldeserializer.PlayerDeserializer");
        kafkaProperties.setProperty("group.id", "kafkaPlayerTut");

        KafkaConsumer<String, Player> playerConsumer = new KafkaConsumer<>(kafkaProperties);
        playerConsumer.subscribe(Collections.singletonList("PlayerCustomSerializerTopic"));

        ConsumerRecords<String, Player> playerRecords = playerConsumer.poll(Duration.ofSeconds(60));
        for (ConsumerRecord<String, Player> records : playerRecords) {
            Player player = records.value();
            System.out.println("Player Name : " + player.getPlayerName());
            System.out.println("Player Country : " + player.getPlayerCountry());
            System.out.println("Player Age : " + player.getPlayerAge());
        }
        playerConsumer.close();

    }
}
