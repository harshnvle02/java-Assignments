package com.demo.services;

import com.demo.beans.Account;

public interface AccountService {

	void addAccount();

	Account[] display();

	void checkBalance(int id, int pin);

	boolean depositMoney(int id1, int pin1, int amt);

	boolean withdraw(int id2, int pin2, int amt);

	void deleteAcc(int id3, int pin3);

}
