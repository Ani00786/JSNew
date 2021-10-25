package com.encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj=new Bank();
		obj.withdrawAmount(123456, 999, 10000);


		obj.updatePin(123456, 1234, 999);
		obj.withdrawAmount(123456, 999, 10000);

	}

}
