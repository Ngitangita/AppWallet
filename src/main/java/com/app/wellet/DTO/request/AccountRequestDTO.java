package com.app.wellet.DTO.request;

import java.time.LocalDateTime;

public record AccountRequestDTO(
        Float sold,
        String accountType,
        LocalDateTime openDate
) {
}
