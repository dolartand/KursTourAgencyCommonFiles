package com.kurs.dto;

import java.io.Serializable;
import java.util.List;

public class TourResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;
    private List<TourDTO> tours;

    public TourResponse(boolean success, String message, List<TourDTO> tours) {
        this.success = success;
        this.message = message;
        this.tours = tours;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<TourDTO> getTours() {
        return tours;
    }
}
