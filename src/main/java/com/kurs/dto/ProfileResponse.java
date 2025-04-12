package com.kurs.dto;

import java.io.Serializable;

public class ProfileResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;
    private UserProfile userProfile;

    public ProfileResponse(boolean success, String message, UserProfile userProfile) {
        this.success = success;
        this.message = message;
        this.userProfile = userProfile;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }
}
