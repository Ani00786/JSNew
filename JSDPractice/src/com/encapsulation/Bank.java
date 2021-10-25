package com.encapsulation;

public class Bank {

	public int accountNo = 123456;
	private int pinNo = 1234;
	private double balanceAmount = 10000;

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public void withdrawAmount(int accNo, int pin, int amount) {
		if (accNo == accountNo && pin == pinNo) {
			if (amount <= balanceAmount) {
				balanceAmount = balanceAmount - amount;
				System.out.println("amount withdrwl" + amount);
			}
			else {
				System.out.println("Low balance");
			}

		} else {
			System.out.println("wrong account");
		}
	}
	public void updatePin(int accNo,int oldPin,int NewPin) {
		if(accNo==accountNo && oldPin==pinNo) {
			pinNo=NewPin;
			System.out.println("Pin change success");
		}
	}
}
