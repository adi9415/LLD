package com.scaler.lld.ParkingLot.Controllers;

import com.scaler.lld.ParkingLot.DTO.GetTicketDTO;
import com.scaler.lld.ParkingLot.Models.VehicleType;
import com.scaler.lld.ParkingLot.Services.EntryGateService;

public class EntryGateController {

    EntryGateService entryGateService = new EntryGateService();

    public GetTicketDTO createTicket(VehicleType vehicleType)
    {
        return entryGateService.createService(vehicleType);
    }
    
}
