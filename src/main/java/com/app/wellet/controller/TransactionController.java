package com.app.wellet.controller;

import com.app.wellet.DTO.request.TransactionRequestDTO;
import com.app.wellet.DTO.response.TransactionResponseDTO;
import com.app.wellet.service.TransactionService;

import java.util.List;

public class TransactionController {
    private final TransactionService transactionService;
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public List<TransactionResponseDTO> getTransactions() {
        return this.transactionService.findAll();
    }

    public List<TransactionResponseDTO> saveTransactions(List<TransactionRequestDTO> toSave) {
        return this.transactionService.saveAll(toSave);
    }

    public List<TransactionResponseDTO> updateTransactions(List<TransactionResponseDTO> toUpdate) {
        return this.transactionService.updateAll(toUpdate);
    }

    public TransactionResponseDTO saveTransaction(TransactionRequestDTO toSave) {
        return this.transactionService.saveByEntity(toSave);
    }

    public TransactionResponseDTO deleteTransaction(TransactionResponseDTO toDelete) {
        return this.transactionService.deleteByEntity ( toDelete );
    }

    public TransactionResponseDTO getTransaction(Long id) {
        return this.transactionService.findById(id);
    }

    public TransactionResponseDTO deleteTransaction(Long id) {
        return this.transactionService.delete(id);
    }
}
