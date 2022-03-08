package com.scaler.lld.ParkingLot.Strategy.Dynamic;

import com.scaler.lld.ParkingLot.Models.VehicleType;
import com.scaler.lld.ParkingLot.Strategy.AlgorithmFactory;
import com.scaler.lld.ParkingLot.Strategy.FeesStrategy;

public class DynamicFactoryStrategy implements AlgorithmFactory{

    public FeesStrategy getStrategy(VehicleType vehicleType)
    {
        switch (vehicleType) {
            case SMALL : return new SmallDynamicFeesStrategy();
            case LARGE : return new LargeDynamicFeesStrategy();
            case MEDIUM : return new MediumDynamicFeesStrategy();
        }

        throw new RuntimeException("Vehicle Tyoe not found");
    }
    
}
