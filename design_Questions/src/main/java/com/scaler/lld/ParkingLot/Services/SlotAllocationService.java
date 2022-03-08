package com.scaler.lld.ParkingLot.Services;

import com.scaler.lld.ParkingLot.Models.ParkingSpot;
import com.scaler.lld.ParkingLot.Models.VehicleType;
import com.scaler.lld.ParkingLot.Repositories.ParkingSpotRepository;

public class SlotAllocationService {

    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot getParkingSpot(VehicleType vehicleType){
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailble(vehicleType);
    }
    
}
