package com.app.wellet.service;

import com.app.wellet.DTO.request.TransactionRequestDTO;
import com.app.wellet.DTO.response.TransactionResponseDTO;
import com.app.wellet.repository.TransactionRepository;

import java.util.List;

public class TransactionService implements ServiceCrudOperations<
        TransactionResponseDTO, TransactionRequestDTO, Long
>{
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionResponseDTO> findAll() {
        return this.transactionRepository.findAll();
    }

    @Override
    public List<TransactionResponseDTO> saveAll(List<TransactionRequestDTO> toSave) {
        return this.transactionRepository.saveAll(toSave);
    }

    @Override
    public List<TransactionResponseDTO> updateAll(List<TransactionResponseDTO> toUpdate) {
        return this.transactionRepository.updateAll(toUpdate);
    }

    @Override
    public TransactionResponseDTO saveByEntity(TransactionRequestDTO toSave) {
        return this.transactionRepository.saveByEntity(toSave);
    }

    @Override
    public TransactionResponseDTO deleteByEntity(TransactionResponseDTO toDelete) {
        return this.transactionRepository.deleteByEntity(toDelete);
    }

    @Override
    public TransactionResponseDTO findById(Long id) {
        return this.transactionRepository.findById(id);
    }

    @Override
    public TransactionResponseDTO delete(Long id) {
        return this.transactionRepository.delete(id);
    }

}
