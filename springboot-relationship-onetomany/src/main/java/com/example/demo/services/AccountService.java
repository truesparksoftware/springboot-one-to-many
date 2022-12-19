package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Account;
import com.example.demo.domain.repositories.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){

        this.accountRepository = accountRepository;
    }
    public Account getAccount(String accountNumber){
        return  accountRepository.findAccount(accountNumber);
    }

    public List<Account> getAccounts(String branchCode){
      return  accountRepository.findAccountsByBranchCode(branchCode);
    }
}
