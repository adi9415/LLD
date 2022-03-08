package com.scaler.lld.SnakesAndLadders.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Ladder extends Cell{

    private Integer endIndex;

    @Override
    public Integer getNextPosition() {
        // TODO Auto-generated method stub
        return endIndex;
    }


    
}
