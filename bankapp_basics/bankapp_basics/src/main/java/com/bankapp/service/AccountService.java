package com.bankapp.service;

import java.util.List;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;

public interface AccountService {
	
	public List<Account> getAll();
	public Account getAccountId(int id);
	public Account save(Account account);
	public Account delete(int id);
	public void transfer(int fromAccountId, int toAccountId, double amount);
	public Account changeAddress(int fromId,AddressChangeRequest request);
	public void deposit(int accountId, double amount);
	public void withdraw(int accountId, double amount);

	
}