package com.aktanyusuf.service.impl;

import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.dto.DtoShipmentIU;
import com.aktanyusuf.model.Shipment;
import com.aktanyusuf.model.ShipmentStatus;
import com.aktanyusuf.repository.ShipmentRepository;
import com.aktanyusuf.service.IShipmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ShipmentServiceImpl implements IShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;

    @Override
    public List<DtoShipment> getAllShipments() {
        List<DtoShipment> dtoShipments = new ArrayList<>();
        for(Shipment shipment : shipmentRepository.findAll()){
            DtoShipment dtoShipment = new DtoShipment();
            BeanUtils.copyProperties(shipment, dtoShipment);
            dtoShipments.add(dtoShipment);
        }
        return dtoShipments;
    }

    @Override
    public DtoShipment getShipmentById(UUID id){
        DtoShipment dtoShipment = new DtoShipment();
        for (Shipment shipment : shipmentRepository.findAll()){
            if (shipment.getId().equals(id)){
                BeanUtils.copyProperties(shipment, dtoShipment);
                break;
            }
        }
        return dtoShipment;
    }


    @Override
    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU) {
        Shipment shipment = new Shipment();
        BeanUtils.copyProperties(dtoShipmentIU, shipment);
        shipment.setCreatedAt(LocalDate.now());
        shipment.setTrackingNumber(Shipment.generateTrackingNumber());
        shipment.setShipmentStatus(ShipmentStatus.PENDING);
        shipmentRepository.save(shipment);
        return getAllShipments();
    }

    @Override
    public List<DtoShipment> deleteShipment(UUID id) {
        for (Shipment shipment: shipmentRepository.findAll()){
            if (shipment.getId().equals(id)){
                shipmentRepository.delete(shipment);
                break;
            }
        }
        return getAllShipments();
    }

    @Override
    public List<DtoShipment> updateShipment(UUID id, DtoShipmentIU dtoShipmentIU) {
        for (Shipment shipment : shipmentRepository.findAll()){
            if (shipment.getId().equals(id)){
                shipmentRepository.delete(shipment);
                break;
            }
        }
        Shipment shipment = new Shipment();
        BeanUtils.copyProperties(dtoShipmentIU, shipment);
        shipmentRepository.save(shipment);
        return getAllShipments();
    }

    @Override
    public List<DtoShipment> pendingShipments() {
        return shipmentRepository.pendingShipments();
    }

}
