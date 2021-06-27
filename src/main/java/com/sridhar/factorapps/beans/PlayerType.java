package com.sridhar.factorapps.beans;

/**
 * Created by sridhar on 26/6/21
 */
public enum PlayerType {
    BOWLER("BOWLER"),
    BATSMAN("BATSMAN"),
    WICKET_KEEPER("WICKET_KEEPER"),
    ALL_ROUNDER("ALL_ROUNDER");

    private String value;


    PlayerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }}
