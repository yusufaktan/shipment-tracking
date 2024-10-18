package com.aktanyusuf.dto;

import com.aktanyusuf.model.ShipmentStatus;
import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty
    private String senderName;
    @NotEmpty
    private String senderAddress;
    @NotEmpty
    private String receiverName;
    @NotEmpty
    private String receiverAddress;

    private ShipmentStatus shipmentStatus;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
