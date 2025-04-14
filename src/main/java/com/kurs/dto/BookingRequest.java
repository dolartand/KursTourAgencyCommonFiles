package com.kurs.dto;

import java.io.Serializable;

public class BookingRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sessionId;

    public BookingRequest() {}

    public BookingRequest(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
