package com.app.wellet.service;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;

import java.util.List;

public class AccountService implements ServiceCrudOperations<
        AccountResponseDTO, AccountRequestDTO, Long
>{
    @Override
    public List<AccountResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<AccountResponseDTO> saveAll(List<AccountRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<AccountResponseDTO> updateAll(List<AccountResponseDTO> toUpdate) {
        return null;
    }

    @Override
    public AccountResponseDTO saveByEntity(AccountRequestDTO toSave) {
        return null;
    }

    @Override
    public AccountResponseDTO deleteByEntity(AccountResponseDTO toDelete) {
        return null;
    }

    @Override
    public AccountResponseDTO findByEntity(AccountResponseDTO toFind) {
        return null;
    }

    @Override
    public AccountResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public AccountResponseDTO delete(Long id) {
        return null;
    }
}
