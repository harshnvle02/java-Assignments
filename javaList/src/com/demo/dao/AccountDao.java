package com.demo.dao;

import java.util.Set;

import com.demo.bean.Account;

public interface AccountDao {

	void addAccount(Account s);


	Account findAccount(int pin1);


	Set<Account> displayList();

}
