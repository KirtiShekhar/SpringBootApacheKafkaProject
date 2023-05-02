package com.kafka.tutorial.player.consumer.modaldeserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.tutorial.player.consumer.modal.Player;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class PlayerDeserializer implements Deserializer<Player> {

    @Override
    public Player deserialize(String playerTopic, byte[] data) {
        ObjectMapper playerObjectMapper = new ObjectMapper();
        Player player = null;
        try {
            player = playerObjectMapper.readValue(data, Player.class);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return player;
    }
}
