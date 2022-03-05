package com.scaler.lld.tictactoe.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class User {
    private String username;
    private String email;
    private String image;
}
