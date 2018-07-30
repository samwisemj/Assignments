package com.capgemini.savingsaccount.classes;

import java.util.Comparator;

public class BankAccountLists implements Comparator<SavingsAccount>{

	
	@Override
	public int compare(SavingsAccount arg0, SavingsAccount arg1) {
		return arg0.getAccID()-arg1.getAccID();
	}
	

}
