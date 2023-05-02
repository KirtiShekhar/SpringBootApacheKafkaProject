package com.kafka.tutorial.player.producer.modalserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.tutorial.player.producer.model.Player;
import org.apache.kafka.common.serialization.Serializer;


public class PlayerSerializer implements Serializer<Player> {

    @Override
    public byte[] serialize(String topic, Player player) {
        byte[] playerResponse = null;
        ObjectMapper playerObjectMapper = new ObjectMapper();
        try {
            playerResponse = playerObjectMapper.writeValueAsString(player).getBytes();
        } catch (JsonProcessingException je) {
            je.printStackTrace();
        }
        return playerResponse;
    }
}
