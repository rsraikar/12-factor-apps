package com.sridhar.factorapps.beans;

/**
 * Created by sridhar on 26/6/21
 */

public class Player {
    private String type="Player";
    private int name;
    private int age;
    private PlayerType playerType;
    private String rating;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
