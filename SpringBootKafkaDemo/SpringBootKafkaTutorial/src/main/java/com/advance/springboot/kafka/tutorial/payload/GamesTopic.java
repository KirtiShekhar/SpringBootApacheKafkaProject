package com.advance.springboot.kafka.tutorial.payload;

public class GamesTopic {
    private Long GameId;
    private String GameName;
    private String GameDescription;
    private Double GameRating;

    public Long getGameId() {
        return GameId;
    }

    public void setGameId(Long gameId) {
        GameId = gameId;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public String getGameDescription() {
        return GameDescription;
    }

    public void setGameDescription(String gameDescription) {
        GameDescription = gameDescription;
    }

    public Double getGameRating() {
        return GameRating;
    }

    public void setGameRating(Double gameRating) {
        GameRating = gameRating;
    }
}
