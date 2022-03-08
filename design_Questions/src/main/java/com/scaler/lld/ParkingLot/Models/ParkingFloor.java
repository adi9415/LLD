package com.scaler.lld.ParkingLot.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private Integer floorNumber;
    private List<ParkingSpot> parkingspots = new ArrayList<>();
    private PaymentCounter paymentCounter;
    private DisplayBoard display;
    
}
