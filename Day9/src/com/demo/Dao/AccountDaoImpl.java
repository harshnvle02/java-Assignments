package com.demo.Dao;
import java.util.*;

import com.demo.Bean.Account;

public class AccountDaoImpl implements AccountDao {

	Set<Account> set = new HashSet<>();
	@Override
	public void addNewAccount(Account s) {
		
		set.add(s);
		
	}
	@Override
	public Account findById(String id, int pin) {
		
		for(Account ac : set)
		{
			if(ac.getAccid().equals(id))
			{
				return ac;
			}
		}
		return null;
	}
	@Override
	public Account getById(int desid) {
		for(Account ac : set)
		{
			if(ac.getAccid().equals(desid)) {
				return ac;
			}
		}
		return null;
	}

}
