package com.mindgate.pojo;

public class Current extends Account {

	private double overdraftBalance;

	public Current() {
		System.out.println("defalt construcor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("overloaded construcor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount>0) {
			if(amount<=getBalance()) {
				setBalance(getBalance()-amount);
				return true;
			}
			else if(amount>getBalance()) {
				double remainAmount= amount- getBalance();
				setBalance(getBalance()-getBalance());
				setOverdraftBalance(getOverdraftBalance()- remainAmount);
			}
			
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount>0) {
			if((amount+getOverdraftBalance())> overdraftBalance) {
				double remainBal=(amount+ getOverdraftBalance())-overdraftBalance;
				setOverdraftBalance(overdraftBalance);
				setBalance(remainBal+ getBalance());
			}
			else {
				setOverdraftBalance(amount+ getOverdraftBalance());
			}
		}

		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
