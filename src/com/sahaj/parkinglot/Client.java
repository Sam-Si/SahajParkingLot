package com.sahaj.parkinglot;

import com.sahaj.parkinglot.controllers.ParkingLotController;
import com.sahaj.parkinglot.controllers.TicketController;
import com.sahaj.parkinglot.dto.ParkingRequestDTO;
import com.sahaj.parkinglot.enums.ParkingLotType;
import com.sahaj.parkinglot.enums.ParkingSpotType;
import com.sahaj.parkinglot.models.ParkingLot;
import com.sahaj.parkinglot.repositories.ParkingLotRepository;
import com.sahaj.parkinglot.repositories.TicketRepository;
import com.sahaj.parkinglot.services.ParkingLotService;
import com.sahaj.parkinglot.services.TicketService;
import com.sahaj.parkinglot.strategies.RandomSpotAssignmentStrategy;

public class Client {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        ParkingLot mallParkingLot = parkingLotController.createParkingLot(ParkingLotType.MALL, 10, 10, 10);
        System.out.println(mallParkingLot);
        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService = new TicketService(ticketRepository, new RandomSpotAssignmentStrategy(mallParkingLot), parkingLotRepository);
        TicketController ticketController = new TicketController(ticketService);
        ParkingRequestDTO parkingRequestDTO = new ParkingRequestDTO();
        parkingRequestDTO.setParkingSpotType(ParkingSpotType.SMALL);
        // generate ticket
        System.out.println(ticketController.generateTicket(parkingRequestDTO));
    }
}
