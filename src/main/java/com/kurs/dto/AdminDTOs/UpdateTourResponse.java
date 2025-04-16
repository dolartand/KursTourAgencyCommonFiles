package com.kurs.dto.AdminDTOs;

import com.kurs.dto.TourDTO;

import java.io.Serializable;

public class UpdateTourResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;
    private TourDTO tour;

    public UpdateTourResponse(boolean success, String message, TourDTO tour) {
        this.success = success;
        this.message = message;
        this.tour = tour;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public TourDTO getTour() {
        return tour;
    }
}
