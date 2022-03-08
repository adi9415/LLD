package com.scaler.lld.SnakesAndLadders.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;



@Data
@Builder(toBuilder = true)
public class Player {

    private User user;
    private Color color;

    @Builder.Default
    private List<Piece> pieces = new ArrayList<>();
    
}
