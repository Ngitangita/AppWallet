package com.app.wellet;


import com.app.wellet.controller.AccountController;
import com.app.wellet.repository.AccountRepository;
import com.app.wellet.service.AccountService;

public class Main {
    public static void main(String[] args){
        AccountRepository accountRepository = new AccountRepository();
        AccountService accountService = new AccountService(accountRepository);
        AccountController accountController = new AccountController(accountService);

        System.out.println(accountController.getAccounts());
    }
}
