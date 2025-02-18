package com.ucb.reservation_service.domain.vo;

import lombok.Data;

@Data
public class LicencePlateNumber {
    private String value;

    public LicencePlateNumber(String value){
        this.value = value;
    }
}
