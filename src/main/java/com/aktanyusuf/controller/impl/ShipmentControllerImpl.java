package com.aktanyusuf.controller.impl;

import com.aktanyusuf.controller.IShipmentController;
import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;
import com.aktanyusuf.service.impl.ShipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/shipment")
public class ShipmentControllerImpl implements IShipmentController {

    @Autowired
    ShipmentServiceImpl shipmentService;

    @Override
    @GetMapping
    public List<DtoShipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @Override
    @PostMapping
    public List<DtoShipment> addShipment(@RequestBody DtoShipmentIU dtoShipmentIU) {
        return shipmentService.addShipment(dtoShipmentIU);
    }
}
