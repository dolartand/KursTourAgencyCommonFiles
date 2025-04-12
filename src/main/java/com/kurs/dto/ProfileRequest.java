package com.kurs.dto;

import java.io.Serializable;

public class ProfileRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sessionId;
    private UserProfile updatedUser;

    public ProfileRequest() {}

    public ProfileRequest(String sessionId, UserProfile updatedUser) {
        this.sessionId = sessionId;
        this.updatedUser = updatedUser;
    }

    public String getSessionId() {
        return sessionId;
    }

    public UserProfile getUpdatedUser() {
        return updatedUser;
    }
}
