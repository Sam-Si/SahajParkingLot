package com.sahaj.parkinglot.strategies;

import com.sahaj.parkinglot.enums.ParkingSpotStatus;
import com.sahaj.parkinglot.enums.ParkingSpotType;
import com.sahaj.parkinglot.models.ParkingLot;
import com.sahaj.parkinglot.models.ParkingSpot;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    private final ParkingLot parkingLot;

    public RandomSpotAssignmentStrategy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot assignSpot(ParkingSpotType parkingSpotType) {
        for (ParkingSpot parkingSpot : parkingLot.generateParkingSpots()) {
            if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.VACANT)
                    && parkingSpot.getParkingSpotType().equals(parkingSpotType)) {
                return parkingSpot;
            }
        }
        return null;
    }
}
