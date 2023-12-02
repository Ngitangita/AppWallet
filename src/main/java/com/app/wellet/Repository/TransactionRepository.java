package com.app.wellet.Repository;

import com.app.wellet.DTO.request.TransactionRequestDTO;

import java.util.List;

public class TransactionRepository implements RepositoryCrudOperations<TransactionRequestDTO, Long>{
    @Override
    public List<TransactionRequestDTO> findAll() {
        return null;
    }

    @Override
    public List<TransactionRequestDTO> saveAll(List<TransactionRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<TransactionRequestDTO> updateAll(List<TransactionRequestDTO> toUpdate) {
        return null;
    }

    @Override
    public TransactionRequestDTO saveByEntity(TransactionRequestDTO toSave) {
        return null;
    }

    @Override
    public TransactionRequestDTO deleteByEntity(TransactionRequestDTO toDelete) {
        return null;
    }

    @Override
    public TransactionRequestDTO updateByEntity(TransactionRequestDTO toUpdate) {
        return null;
    }

    @Override
    public TransactionRequestDTO findByEntity(Long toFind) {
        return null;
    }

    @Override
    public TransactionRequestDTO update(Long id) {
        return null;
    }

    @Override
    public TransactionRequestDTO delete(Long id) {
        return null;
    }

    @Override
    public TransactionRequestDTO findById(Long id) {
        return null;
    }
}
