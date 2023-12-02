package com.app.wellet.DTO.response;

import java.time.LocalDateTime;

public record AccountResponseDTO(
        Integer id,
        Float sold,
        String accountType,
        LocalDateTime openDate
) {
}
