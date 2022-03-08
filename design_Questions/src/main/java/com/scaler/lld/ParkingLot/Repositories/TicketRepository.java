package com.scaler.lld.ParkingLot.Repositories;

import java.util.ArrayList;
import java.util.List;

import com.scaler.lld.ParkingLot.Models.Ticket;

public class TicketRepository {

    List<Ticket> ticketList=  new ArrayList<>();

    public Ticket save(Ticket ticket)
    {
        ticketList.add(ticket);
        return ticket;
    }
    
}
