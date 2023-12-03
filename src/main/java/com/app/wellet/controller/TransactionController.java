package com.app.wellet.controller;

import com.app.wellet.service.TransactionService;

public class TransactionController {
    private final TransactionService transactionService;
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
}
