package com.scaler.lld.ParkingLot.Controllers;

import com.scaler.lld.ParkingLot.Models.Ticket;
import com.scaler.lld.ParkingLot.Services.ExitGateService;

public class ExitGateController {
    
    ExitGateService exitGateService = new ExitGateService();

    public int checkPayment(Ticket ticket){
        Integer fees = exitGateService.checkPayment(ticket);
        return fees;
    }
}
