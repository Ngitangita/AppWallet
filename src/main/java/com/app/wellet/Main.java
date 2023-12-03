package com.app.wellet;


import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;
import com.app.wellet.controller.AccountController;
import com.app.wellet.repository.AccountRepository;
import com.app.wellet.service.AccountService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        AccountRepository accountRepository = new AccountRepository();
        AccountService accountService = new AccountService(accountRepository);
        AccountController accountController = new AccountController(accountService);

        //findAll
        System.out.println(accountController.getAccounts());

        // saveAll
          /* List<AccountRequestDTO> accountsToSave = List.of(
                   new AccountRequestDTO(100.0f, "Checking", LocalDateTime.now(), 110012L),
                   new AccountRequestDTO(200.0f, "Savings", LocalDateTime.now(), 230013L)
           );
           System.out.println(accountController.saveAccounts(accountsToSave)); */

        // updateAccounts


    }
}
