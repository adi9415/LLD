package com.scaler.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private Ticket ticket;
    private Integer amount;
    private String mode;
    
}
