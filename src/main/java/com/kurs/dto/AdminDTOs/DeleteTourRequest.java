package com.kurs.dto.AdminDTOs;

import java.io.Serializable;

public class DeleteTourRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int tourId;

    public DeleteTourRequest() {}

    public DeleteTourRequest(int tourId) {
        this.tourId = tourId;
    }

    public int getTourId() {
        return tourId;
    }
}
