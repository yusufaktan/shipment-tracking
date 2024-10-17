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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU) {
        return List.of();
    }

    /*
    @Override
    public List<DtoShipment> addShipment(DtoShipmentIU dtoShipmentIU) {
        Shipment shipment = new Shipment();
        BeanUtils.copyProperties(dtoShipmentIU, shipment);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = formatter.format(new Date());
            Date date = formatter.parse(formattedDate);
            shipment.setCreatedAt(date);
        } catch (ParseException e){
            e.printStackTrace();
        }
        shipment.setTrackingNumber(Shipment.generateTrackingNumber());
        shipment.setShipmentStatus(ShipmentStatus.PENDING);
        shipmentRepository.save(shipment);
        return getAllShipments();
    }

     */

}
