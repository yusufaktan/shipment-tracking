package com.aktanyusuf.controller.impl;

import com.aktanyusuf.controller.IShipmentController;
import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;
import com.aktanyusuf.service.impl.ShipmentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping(path = "/{id}")
    public DtoShipment getShipmentById(@PathVariable(name = "id") UUID id){
        return shipmentService.getShipmentById(id);
    }

    @Override
    @PostMapping
    public List<DtoShipment> addShipment(@RequestBody @Valid DtoShipmentIU dtoShipmentIU) {
        return shipmentService.addShipment(dtoShipmentIU);
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public List<DtoShipment> deleteShipment(@PathVariable(name = "id") UUID id) {
        return shipmentService.deleteShipment(id);
    }

    @Override
    @PutMapping(path = "/{id}")
    public List<DtoShipment> updateShipment(@PathVariable(name = "id") UUID id, @RequestBody @Valid DtoShipmentIU dtoShipmentIU) {
        return shipmentService.updateShipment(id, dtoShipmentIU);
    }

    @Override
    @GetMapping(path = "/pendingShipments")
    public List<DtoShipment> pendingShipments() {
        return shipmentService.pendingShipments();
    }

    @Override
    @PostMapping(path = "/statusUpdate/{id}")
    public DtoShipment statusUpdate(@PathVariable(name = "id") UUID id, @RequestParam(name = "status") String status) {
        return shipmentService.statusUpdate(id, status);
    }
}
