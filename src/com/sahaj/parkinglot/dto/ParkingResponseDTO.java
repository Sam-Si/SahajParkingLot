package com.sahaj.parkinglot.dto;

import java.util.Date;

public class ParkingResponseDTO {
    private Long ticketNumber;
    private Long spotNumber;
    private Date entryTime;

    public Long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Long getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Long spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "ParkingResponseDTO{" +
                "ticketNumber=" + ticketNumber +
                ", spotNumber=" + spotNumber +
                ", entryTime=" + entryTime +
                '}';
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
