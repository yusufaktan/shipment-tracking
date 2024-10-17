package com.aktanyusuf.dto;

import com.aktanyusuf.model.ShipmentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoShipment {

    private String trackingNumber;
    private String senderName;
    private String receiverName;
    private ShipmentStatus shipmentStatus;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
