package com.app.wellet.DTO.request;

import java.time.LocalDateTime;

public class TransactionRequestDTO {
    private final Float amount;
    private final String type;
    private final LocalDateTime transactionDate;

    public TransactionRequestDTO(Float amount, String type, LocalDateTime transactionDate) {
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
    }

    public Float getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
}
