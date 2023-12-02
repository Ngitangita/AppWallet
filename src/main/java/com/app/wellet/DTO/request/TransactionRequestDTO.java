package com.app.wellet.DTO.request;

import java.time.LocalDateTime;

public record TransactionRequestDTO(
        Float amount,
        String type,
        LocalDateTime transactionDate
) {
}
