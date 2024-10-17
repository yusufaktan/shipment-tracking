package com.aktanyusuf.dto;

import com.aktanyusuf.model.ShipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoShipmentIU {

    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;

}
