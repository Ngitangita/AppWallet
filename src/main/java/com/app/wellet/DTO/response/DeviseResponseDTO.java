package com.app.wellet.DTO.response;

public record DeviseResponseDTO(
        Integer id,
        Float rateChange,
        String deviseSymbol
) {
}
