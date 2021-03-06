package com.googlecode.googleplus.model.moments;

import com.fasterxml.jackson.annotation.JsonValue;


public enum MomentType {
    ADD("http://schemas.google.com/AddActivity"),
    BUY("http://schemas.google.com/BuyActivity"),
    CHECK_IN("http://schemas.google.com/CheckInActivity"),
    COMMENT("http://schemas.google.com/CommentActivity"),
    CREATE("http://schemas.google.com/CreateActivity"),
    DISCOVER("http://schemas.google.com/DiscoverActivity"),
    LISTEN("http://schemas.google.com/ListenActivity"),
    RESERVE("http://schemas.google.com/ReserveActivity"),
    REVIEW("http://schemas.google.com/ReviewActivity"),
    WANT("http://schemas.google.com/WantActivity");

    private String type;

    private MomentType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }
}
