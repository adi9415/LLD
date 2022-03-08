package com.scaler.lld.ParkingLot.DTO;

import java.time.LocalDateTime;

import com.scaler.lld.ParkingLot.Models.VehicleType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(toBuilder = true)
public class GetTicketDTO {

    private VehicleType vehicleType;
    private LocalDateTime entryTime;
}
