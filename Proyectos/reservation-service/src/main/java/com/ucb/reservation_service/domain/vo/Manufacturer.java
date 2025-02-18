package com.ucb.reservation_service.domain.vo;

import lombok.Data;

@Data
public class Manufacturer {
    private String value;

    public Manufacturer(String value){
        this.value = value;
    }
}
