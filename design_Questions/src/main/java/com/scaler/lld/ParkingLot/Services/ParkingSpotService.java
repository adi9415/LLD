package com.scaler.lld.ParkingLot.Services;

import com.scaler.lld.ParkingLot.Models.ParkingSpot;
import com.scaler.lld.ParkingLot.Repositories.ParkingSpotRepository;

public class ParkingSpotService {

    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot markSpot(ParkingSpot parkingSpot){
        parkingSpotRepository.save(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot freeSpot(ParkingSpot parkingSpot){
        parkingSpotRepository.free(parkingSpot);
        return parkingSpot;
    }
    
}
