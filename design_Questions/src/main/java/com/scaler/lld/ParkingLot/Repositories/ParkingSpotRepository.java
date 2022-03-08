package com.scaler.lld.ParkingLot.Repositories;

import java.util.ArrayList;
import java.util.List;

import com.scaler.lld.ParkingLot.Models.ParkingSpot;
import com.scaler.lld.ParkingLot.Models.SpotStatus;
import com.scaler.lld.ParkingLot.Models.VehicleType;

public class ParkingSpotRepository {

    List<ParkingSpot> parkingSpotLists = new ArrayList<>();

    public ParkingSpot save(ParkingSpot parkingSpot)
    {
        parkingSpotLists.add(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot free(ParkingSpot parkingSpot)
    {
        parkingSpotLists.remove(parkingSpot);
        return parkingSpot;
    }


    public ParkingSpot findOneByVehicleTypeAndStatusAvailble(VehicleType vehicleType)
    {
        for(ParkingSpot parkingSpot : parkingSpotLists)
        {
            if(parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == vehicleType)
                return parkingSpot;
            
        }
        throw new RuntimeException("No Parking Spot Available");
    }
    
}
