package com.scaler.lld.SnakesAndLadders.models;

import lombok.Builder;
import lombok.Setter;


@Setter
@Builder(toBuilder = true)
public class User {

    private Integer id;
    private String name;
    private String email;
    
}
