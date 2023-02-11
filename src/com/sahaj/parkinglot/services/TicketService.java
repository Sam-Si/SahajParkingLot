package com.sahaj.parkinglot.services;

import com.sahaj.parkinglot.dto.ParkingRequestDTO;
import com.sahaj.parkinglot.models.ParkingSpot;
import com.sahaj.parkinglot.models.Ticket;
import com.sahaj.parkinglot.repositories.ParkingLotRepository;
import com.sahaj.parkinglot.repositories.TicketRepository;
import com.sahaj.parkinglot.strategies.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private final TicketRepository ticketRepository;
    private final SpotAssignmentStrategy spotAssignmentStrategy;
    private final ParkingLotRepository parkingLotRepository;

    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(ParkingRequestDTO parkingRequestDTO) {
        // get parking lot
        // find the parking spot.
        ParkingSpot parkingSpot = this.spotAssignmentStrategy.assignSpot(parkingRequestDTO.getParkingSpotType());
        if (parkingSpot == null) {
            return null;
        }
        Ticket ticket = new Ticket();
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(new Date());
        return this.ticketRepository.save(ticket);
    }
}
