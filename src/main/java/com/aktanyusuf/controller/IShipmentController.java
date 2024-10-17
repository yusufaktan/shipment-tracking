package com.aktanyusuf.controller;

import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;

import java.util.List;

public interface IShipmentController{

    public List<DtoShipment> getAllShipments();

    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU);

}
