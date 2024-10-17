package com.aktanyusuf.controller;

import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;

import java.util.List;
import java.util.UUID;

public interface IShipmentController{

    public List<DtoShipment> getAllShipments();

    public DtoShipment getShipmentById(UUID id);

    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU);

    public List<DtoShipment> deleteShipment(UUID id);

    public List<DtoShipment> updateShipment(UUID id, DtoShipmentIU dtoShipmentIU);

}
