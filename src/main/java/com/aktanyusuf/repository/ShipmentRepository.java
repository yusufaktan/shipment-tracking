package com.aktanyusuf.repository;

import com.aktanyusuf.dto.DtoShipment;
import com.aktanyusuf.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, UUID> {

    @Query("SELECT new com.aktanyusuf.dto.DtoShipment(s.trackingNumber, s.senderName, " +
            "s.receiverName, s.shipmentStatus, s.createdAt, s.updatedAt) " +
            "FROM Shipment s WHERE s.shipmentStatus = 'PENDING'")
    List<DtoShipment> pendingShipments();

}
