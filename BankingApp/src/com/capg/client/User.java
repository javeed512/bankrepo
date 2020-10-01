package com.capg.client;

import com.capg.beans.Account;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac = new Account();
		
		
		ac.setAccountNum(9900);
		ac.setAccountType("Savings");
		
		
		System.out.println(ac);
		
		System.out.println(ac.getAccountNum());
		
	}

}
