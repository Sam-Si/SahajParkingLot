package com.sahaj.parkinglot.controllers;

import com.sahaj.parkinglot.enums.ParkingLotType;
import com.sahaj.parkinglot.models.ParkingLot;
import com.sahaj.parkinglot.services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot createParkingLot(ParkingLotType parkingLotType, int smallCapacity, int mediumCapacity, int largeCapacity) {
        return parkingLotService.createParkingLot(parkingLotType, smallCapacity, mediumCapacity, largeCapacity);
    }
}
