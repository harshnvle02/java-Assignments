package com.demo.dao;

import java.util.*;

import com.demo.bean.Account;

public class AccountDaoImpl implements AccountDao {

	Set<Account> set =new HashSet<>();
	@Override
	public void addAccount(Account s) {
		
		set.add(s);
		
	}
	@Override
	public Account findAccount(int pin) {
		
		for(Account ac : set)
		{
			if(ac != null)
			{
				if(ac.getPin() == pin)
				{
					return ac;
				}
			}
		}
		return null;
	}
	@Override
	public Set<Account> displayList() {
		
		return set;
	}
	
	
	

}
