package com.app.wellet.service;

import com.app.wellet.DTO.request.TransactionRequestDTO;
import com.app.wellet.DTO.response.TransactionResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class TransactionService implements ServiceCrudOperations<
        TransactionResponseDTO, TransactionRequestDTO, Long
>{
    @Override
    public List<TransactionResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> saveAll(List<TransactionRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> updateAll(List<TransactionResponseDTO> toUpdate) {
        return null;
    }

    @Override
    public TransactionResponseDTO saveByEntity(TransactionRequestDTO toSave) {
        return null;
    }

    @Override
    public TransactionResponseDTO deleteByEntity(TransactionResponseDTO toDelete) {
        return null;
    }

    @Override
    public TransactionResponseDTO findByEntity(TransactionResponseDTO toFind) {
        return null;
    }

    @Override
    public TransactionResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public TransactionResponseDTO delete(Long id) {
        return null;
    }
}