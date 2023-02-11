package com.sahaj.parkinglot.dto;

import com.sahaj.parkinglot.enums.ParkingSpotType;
import com.sahaj.parkinglot.enums.VehicleType;

public class ParkingRequestDTO {
    private ParkingSpotType parkingSpotType;

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
