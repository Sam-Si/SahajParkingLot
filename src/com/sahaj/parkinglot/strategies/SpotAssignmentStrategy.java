package com.sahaj.parkinglot.strategies;

import com.sahaj.parkinglot.enums.VehicleType;
import com.sahaj.parkinglot.models.ParkingLot;
import com.sahaj.parkinglot.enums.ParkingSpotType;
import com.sahaj.parkinglot.models.ParkingSpot;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingSpotType parkingSpotType);
}