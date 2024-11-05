package com.demo.service;

import java.util.Set;

import com.demo.bean.Account;

public interface AccountService {

	void addAccount(int ch);

	boolean changePin(int pin1);

	Set<Account> displayList();



}
