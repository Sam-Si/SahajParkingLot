package com.sahaj.parkinglot.repositories;

import com.sahaj.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
   private Map<Long, ParkingLot> parkingLotMap=new HashMap<>();
    // to get the new id we can keep the counter.
    // Map and counter should not be static
    private long lastCount=0;
    public ParkingLot save(ParkingLot parkingLot){

    lastCount++;

    parkingLotMap.put(lastCount,parkingLot);

    parkingLot.setId(lastCount);

    return parkingLot;

    }
    public ParkingLot updateById(Long id,ParkingLot parkingLot){
     parkingLotMap.replace(id,parkingLot);
     return parkingLot;
    }
    public ParkingLot getParkingLotById(Long id)
    {
     return parkingLotMap.get(id);
    }

}
