package com.kurs.dto;

import java.io.Serializable;

public class BookTourRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int tourId;
    private String sessionId;

    public BookTourRequest() {}

    public BookTourRequest(int tourId, String sessionId) {
        this.tourId = tourId;
        this.sessionId = sessionId;
    }

    public int getTourId() {
        return tourId;
    }

    public String getSessionId() {
        return sessionId;
    }
}
