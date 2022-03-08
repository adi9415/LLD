package com.scaler.lld.ParkingLot.Strategy.TimeBased;

import com.scaler.lld.ParkingLot.Models.VehicleType;
import com.scaler.lld.ParkingLot.Strategy.AlgorithmFactory;
import com.scaler.lld.ParkingLot.Strategy.FeesStrategy;

public class TimeBaseFactoryStrategy implements AlgorithmFactory{
    
    public FeesStrategy getStrategy(VehicleType vehicleType){
        switch (vehicleType) {
            case LARGE: return new LargeVehicleFeesStrategy();
            case MEDIUM: return new MediumVehicleFeesStrategy();
            case SMALL: return new SmallVehicleFeesStrategy();
    }
    throw new RuntimeException("Vehicle Type not found"); 
}
}
