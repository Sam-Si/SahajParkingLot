package com.sahaj.parkinglot.models;

public class Bill extends BaseModel {
    private Ticket ticket;
    private int amount;
    private String exitTime;
    private String invoiceNumber;
}
