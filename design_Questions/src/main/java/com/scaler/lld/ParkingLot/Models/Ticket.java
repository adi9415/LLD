package com.scaler.lld.ParkingLot.Models;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(toBuilder = true)
public class Ticket  extends BaseModel{
    private Integer id;
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Integer floorNumber;
    private ParkingSpot spotNumber;
    private TicketStatus ticketStatus;
}
