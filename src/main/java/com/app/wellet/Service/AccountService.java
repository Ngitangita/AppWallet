package com.app.wellet.Service;

import com.app.wellet.DTO.request.AccountRequestDTO;

import java.util.List;

public class AccountService implements ServiceCrudOperations<AccountRequestDTO, Long> {
    @Override
    public List<AccountRequestDTO> findAll() {
        return null;
    }

    @Override
    public List<AccountRequestDTO> saveAll(List<AccountRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<AccountRequestDTO> updateAll(List<AccountRequestDTO> toUpdate) {
        return null;
    }

    @Override
    public AccountRequestDTO saveByEntity(AccountRequestDTO toSave) {
        return null;
    }

    @Override
    public AccountRequestDTO deleteByEntity(AccountRequestDTO toDelete) {
        return null;
    }

    @Override
    public AccountRequestDTO updateByEntity(AccountRequestDTO toUpdate) {
        return null;
    }

    @Override
    public AccountRequestDTO findByEntity(Long toFind) {
        return null;
    }

    @Override
    public AccountRequestDTO update(Long id) {
        return null;
    }

    @Override
    public AccountRequestDTO delete(Long id) {
        return null;
    }

    @Override
    public AccountRequestDTO findById(Long id) {
        return null;
    }
}
