package com.ucb.reservation_service.domain.model;

import com.ucb.reservation_service.domain.vo.CarID;
import com.ucb.reservation_service.domain.vo.CarModel;
import com.ucb.reservation_service.domain.vo.LicencePlateNumber;
import com.ucb.reservation_service.domain.vo.Manufacturer;
import lombok.Data;

@Data
public class Car {
    private CarID id;
    private Manufacturer manufacturer;
    private LicencePlateNumber licencePlateNumber;
    private CarModel model;

}

