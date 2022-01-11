package com.marticus;

public class Company {

	private Account acct;

	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}
	
	public void showacct()
	{
		acct.withDrawMoney();
	}
}
