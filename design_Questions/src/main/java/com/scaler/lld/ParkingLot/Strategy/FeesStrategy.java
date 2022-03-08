package com.scaler.lld.ParkingLot.Strategy;

import com.scaler.lld.ParkingLot.Models.Ticket;

public interface FeesStrategy {
    
    public Integer calculateFees(Ticket ticket);
    
}
