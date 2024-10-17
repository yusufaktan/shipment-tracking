package com.aktanyusuf.dto;

import com.aktanyusuf.model.ShipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoShipmentIU {

    private String trackingNumber;
    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;
    private ShipmentStatus shipmentStatus;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
