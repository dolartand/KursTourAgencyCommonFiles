package com.kurs.dto;

import java.io.Serializable;
import java.util.List;

public class BookingResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;
    private List<BookingDTO> bookings;

    public BookingResponse() {}

    public BookingResponse(boolean success, String message, List<BookingDTO> bookings) {
        this.success = success;
        this.message = message;
        this.bookings = bookings;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<BookingDTO> getBookings() {
        return bookings;
    }
}
