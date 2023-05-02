package com.kafka.tutorial.player.producer.topicproducer;

import com.kafka.tutorial.player.producer.model.Player;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Scanner;

public class PlayerProducer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Properties kafkaProperties = new Properties();
        kafkaProperties.setProperty("bootstrap.servers", "localhost:9092");
        kafkaProperties.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProperties.setProperty("value.serializer", "com.kafka.tutorial.player.producer.modalserializer.PlayerSerializer");

        System.out.println("Enter Player Name : ");
        String playerName = scanner.nextLine();
        System.out.println("Enter Player Country : ");
        String playerCountry = scanner.nextLine();
        System.out.println("Enter Player Age : ");
        Integer playerAge = scanner.nextInt();

        KafkaProducer<String, Player> playerProducer = new KafkaProducer<String, Player>(kafkaProperties);
        Player player = new Player();
        player.setPlayerName(playerName);
        player.setPlayerCountry(playerCountry);
        player.setPlayerAge(playerAge);
        ProducerRecord<String, Player> playerRecord = new ProducerRecord<String, Player>("PlayerCustomSerializerTopic", player.getPlayerName(), player);

        try {
            playerProducer.send(playerRecord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            playerProducer.close();
        }
    }
}
