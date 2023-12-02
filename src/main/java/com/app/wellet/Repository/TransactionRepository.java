package com.app.wellet.Repository;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.request.TransactionRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;
import com.app.wellet.DTO.response.TransactionResponseDTO;

import java.util.List;

public class TransactionRepository implements RepositoryCrudOperations<
        TransactionResponseDTO, TransactionRequestDTO, Long
> {

    @Override
    public List<TransactionResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> saveAll(List<TransactionRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<TransactionResponseDTO> updateAll(List<TransactionRequestDTO> toUpdate) {
        return null;
    }

    @Override
    public TransactionResponseDTO saveByEntity(TransactionRequestDTO toSave) {
        return null;
    }

    @Override
    public TransactionResponseDTO deleteByEntity(TransactionRequestDTO toDelete) {
        return null;
    }

    @Override
    public TransactionResponseDTO updateByEntity(TransactionRequestDTO toUpdate) {
        return null;
    }

    @Override
    public TransactionResponseDTO findByEntity(TransactionRequestDTO toFind) {
        return null;
    }

    @Override
    public TransactionResponseDTO update(Long id) {
        return null;
    }

    @Override
    public TransactionResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public TransactionResponseDTO findById(Long id) {
        return null;
    }
}
