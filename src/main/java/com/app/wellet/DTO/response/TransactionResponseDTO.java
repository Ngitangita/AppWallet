package com.app.wellet.DTO.response;

import java.time.LocalDateTime;

public record TransactionResponseDTO(
        Integer id,
        Float amount,
        String type,
        LocalDateTime transactionDate
) {
}
