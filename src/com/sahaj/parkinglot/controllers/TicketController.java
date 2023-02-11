package com.sahaj.parkinglot.controllers;

import com.sahaj.parkinglot.dto.ParkingRequestDTO;
import com.sahaj.parkinglot.dto.ParkingResponseDTO;
import com.sahaj.parkinglot.models.Ticket;
import com.sahaj.parkinglot.services.TicketService;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ParkingResponseDTO generateTicket(ParkingRequestDTO parkingRequestDTO) {
        Ticket ticket = ticketService.generateTicket(parkingRequestDTO);
        ParkingResponseDTO parkingResponseDTO = new ParkingResponseDTO();
        parkingResponseDTO.setTicketNumber(ticket.getId());
        parkingResponseDTO.setSpotNumber(ticket.getParkingSpot().getId());
        parkingResponseDTO.setEntryTime(ticket.getEntryTime());
        return parkingResponseDTO;
    }
}
