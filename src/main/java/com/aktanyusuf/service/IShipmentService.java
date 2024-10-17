package com.aktanyusuf.service;

import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;

import java.util.List;

public interface IShipmentService {

    public List<DtoShipment> getAllShipments();

    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU);

}
