package com.capgemini.savingsaccount.test;

import java.util.TreeSet;

import com.capgemini.savingsaccount.classes.*;

public class BankAccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding to treeset in descending order of accID
		TreeSet<SavingsAccount> treeSet=new TreeSet<>(new BankAccountLists());
		
		treeSet.add(new SavingsAccount(1004, 150000.00, false, "Jhilmil"));
		treeSet.add(new SavingsAccount(1003, 0.00, true, "Suresh"));
		treeSet.add(new SavingsAccount(1002, 10000.00, false, "Asish"));
		treeSet.add(new SavingsAccount(1001, 500.00, true, "Abish"));
		treeSet.add(new SavingsAccount(1000, 100.00, false, "Rakesh"));
		
		treeSet.stream().forEach((account)->System.out.println(account));
		
	}

}
