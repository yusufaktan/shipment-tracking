package com.aktanyusuf.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {

    private UUID id;

    private LocalDateTime errorTime;

    private T errors;

}
