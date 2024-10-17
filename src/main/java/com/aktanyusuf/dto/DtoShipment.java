package com.aktanyusuf.dto;

import com.aktanyusuf.model.ShipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoShipment {

    private String trackingNumber;
    private String senderName;
    private String receiverName;
    private ShipmentStatus shipmentStatus;
    private Date createdAt;
    private Date updatedAt;

}
