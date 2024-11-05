package com.demo.Dao;

import com.demo.Bean.Account;

public interface AccountDao {

	void addNewAccount(Account s);

	Account findById(String sid, int pin);

	Account getById(int desid);

}
