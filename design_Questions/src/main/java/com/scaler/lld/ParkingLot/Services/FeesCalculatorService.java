package com.scaler.lld.ParkingLot.Services;

import com.scaler.lld.ParkingLot.Models.AlgorithmType;
import com.scaler.lld.ParkingLot.Models.Ticket;
import com.scaler.lld.ParkingLot.Strategy.FeesStrategy;
import com.scaler.lld.ParkingLot.Strategy.AlgorithmStrategyFactory;

public class FeesCalculatorService {
    // public static final AlgorithmType ALGORITHM = AlgorithmType.TIME_BASED;
    public int calculateFees(Ticket ticket, AlgorithmType ALGORITHM){
        FeesStrategy feesStrategy = AlgorithmStrategyFactory
                                    .getFactory(ALGORITHM)
                                    .getStrategy(ticket.getVehicleType());
        
         return feesStrategy.calculateFees(ticket);
    }
    
}

// Model fees calculationa s a strategy
// check relevatn strategy by vehicle type and algorithm
// strategy + Abstract Factory
