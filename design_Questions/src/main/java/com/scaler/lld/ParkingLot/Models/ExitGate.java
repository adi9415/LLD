package com.scaler.lld.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExitGate extends Gates{

    private PaymentCounter paymentCounter;
    private Operator operator;
    
}
