package com.app.wellet.Repository;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;

import java.util.List;

public class AccountRepository implements RepositoryCrudOperations<
        AccountResponseDTO,AccountRequestDTO, Long
>  {

    @Override
    public List<AccountResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<AccountResponseDTO> saveAll(List<AccountRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<AccountResponseDTO> updateAll(List<AccountRequestDTO> toUpdate) {
        return null;
    }

    @Override
    public AccountResponseDTO saveByEntity(AccountRequestDTO toSave) {
        return null;
    }

    @Override
    public AccountResponseDTO deleteByEntity(AccountRequestDTO toDelete) {
        return null;
    }

    @Override
    public AccountResponseDTO updateByEntity(AccountRequestDTO toUpdate) {
        return null;
    }

    @Override
    public AccountResponseDTO findByEntity(AccountRequestDTO toFind) {
        return null;
    }

    @Override
    public AccountResponseDTO update(Long id) {
        return null;
    }

    @Override
    public AccountResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public AccountResponseDTO findById(Long id) {
        return null;
    }
}
