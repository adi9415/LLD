package com.scaler.lld.ParkingLot.Models;

import java.util.Date;

import lombok.Data;

@Data
public class BaseModel {
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    
}
