package com.scaler.lld.ParkingLot.Strategy;

import com.scaler.lld.ParkingLot.Models.AlgorithmType;
import com.scaler.lld.ParkingLot.Strategy.Dynamic.DynamicFactoryStrategy;
import com.scaler.lld.ParkingLot.Strategy.TimeBased.TimeBaseFactoryStrategy;

public class AlgorithmStrategyFactory {

    public static AlgorithmFactory getFactory(AlgorithmType algorithmType)
    {
        switch(algorithmType)
        {
            case TIME_BASED: return new TimeBaseFactoryStrategy();
            case DYNAMIC: return new DynamicFactoryStrategy();
        }

        throw new RuntimeException("strategy not found");
    }
    
}
