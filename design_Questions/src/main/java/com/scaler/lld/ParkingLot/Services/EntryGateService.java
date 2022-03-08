package com.scaler.lld.ParkingLot.Services;

import com.scaler.lld.ParkingLot.DTO.GetTicketDTO;
import com.scaler.lld.ParkingLot.Models.ParkingSpot;
import com.scaler.lld.ParkingLot.Models.Ticket;
import com.scaler.lld.ParkingLot.Models.VehicleType;

public class EntryGateService {

    SlotAllocationService slotAllocationService = new SlotAllocationService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    GetTicketService getTicketService = new GetTicketService();
    public GetTicketDTO createService(VehicleType vehicleType){
        
        ParkingSpot spot = slotAllocationService.getParkingSpot(vehicleType);

        if(spot == null){
            throw new RuntimeException("no slots availbale");
        }

        parkingSpotService.markSpot(spot);

        Ticket ticket  = getTicketService.getTicket(vehicleType, spot);

        GetTicketDTO ticketDTO = GetTicketDTO
                                .builder()
                                .entryTime(ticket.getEntryTime())
                                .vehicleType(ticket.getVehicleType())
                                .build();

        return ticketDTO;

    }
    
}

// 1. find availbel spot
// 2. marked as booked
// 3. create a ticket
// 4. transform to DTO
