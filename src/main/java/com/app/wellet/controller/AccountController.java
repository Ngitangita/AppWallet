package com.app.wellet.controller;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;
import com.app.wellet.service.AccountService;

import java.util.List;

public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<AccountResponseDTO> getAccounts() {
        return this.accountService.findAll();
    }

    public List<AccountResponseDTO> saveAccounts(List<AccountRequestDTO> toSave) {
        return this.accountService.saveAll(toSave);
    }

    public List<AccountResponseDTO> updateAccounts(List<AccountResponseDTO> toUpdate) {
        return this.accountService.updateAll(toUpdate);
    }

    public AccountResponseDTO saveAccount(AccountRequestDTO toSave) {
        return this.accountService.saveByEntity(toSave);
    }

    public AccountResponseDTO deleteAccount(AccountResponseDTO toDelete) {
        return this.accountService.deleteByEntity ( toDelete );
    }

    public AccountResponseDTO getAccount(Long id) {
        return this.accountService.findById(id);
    }

    public AccountResponseDTO deleteAccount(Long id) {
        return this.accountService.delete(id);
    }
}
