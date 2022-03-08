package com.scaler.lld.ParkingLot.Strategy;

import com.scaler.lld.ParkingLot.Models.VehicleType;

public interface AlgorithmFactory {
    
    public FeesStrategy getStrategy(VehicleType vehicleType);
}
