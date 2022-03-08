package com.scaler.lld.ParkingLot.Services;

import com.scaler.lld.ParkingLot.Models.AlgorithmType;
import com.scaler.lld.ParkingLot.Models.Ticket;
import com.scaler.lld.ParkingLot.Models.TicketStatus;

public class ExitGateService {

    private static final AlgorithmType algorithm = AlgorithmType.TIME_BASED;
    FeesCalculatorService feesCalculatorService = new FeesCalculatorService();
    ParkingSpotService parkingSpotService  = new ParkingSpotService();
    Integer fees = 0;

    public Integer checkPayment(Ticket ticket)
    {
        if(ticket.getTicketStatus() == TicketStatus.PENDING)
        {
            fees = feesCalculatorService.calculateFees(ticket,algorithm);
            ticket.setTicketStatus(TicketStatus.DONE);
        }


        parkingSpotService.freeSpot(ticket.getSpotNumber());

        return fees;
    }
    
}

// 1.
// 2. check ticket status
// 3. calculate remaining fees on timebased stargety
// 4. make spot available
