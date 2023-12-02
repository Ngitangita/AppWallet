package com.app.wellet.controller;

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
}
