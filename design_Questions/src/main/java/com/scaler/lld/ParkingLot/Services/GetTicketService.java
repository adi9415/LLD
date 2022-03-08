package com.scaler.lld.ParkingLot.Services;

import java.time.LocalDateTime;

import com.scaler.lld.ParkingLot.Models.ParkingSpot;
import com.scaler.lld.ParkingLot.Models.Ticket;
import com.scaler.lld.ParkingLot.Models.VehicleType;
import com.scaler.lld.ParkingLot.Repositories.TicketRepository;

public class GetTicketService {
    TicketRepository ticketRepository = new TicketRepository();
    public Ticket getTicket(VehicleType vehicleType, ParkingSpot parkingSpot)
    {
        Ticket ticket = Ticket
                .builder()
                .entryTime(LocalDateTime.now())
                .vehicleType(vehicleType)
                .floorNumber(parkingSpot.getFloorNumber())
                .build();

        ticketRepository.save(ticket);
        return ticket;
    }
    
}
