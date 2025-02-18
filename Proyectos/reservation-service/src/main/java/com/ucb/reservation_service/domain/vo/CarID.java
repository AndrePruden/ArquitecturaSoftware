package com.ucb.reservation_service.domain.vo;

import lombok.Data;

import java.util.UUID;

@Data
public class CarID {
    private UUID id;
    private CarID(UUID id){
        this.id = id;
    }

    public static CarID withID(String id){
        return new CarID(UUID.fromString(id));
    }

    public static CarID withoutID(){
        return new CarID(UUID.randomUUID());
    }
}
