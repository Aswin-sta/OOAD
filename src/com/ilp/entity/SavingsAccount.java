package com.ilp.entity;

import java.util.ArrayList;

public class SavingsAccount extends Product{

	private double minBalance=1000;
	public SavingsAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
		// TODO Auto-generated constructor stub
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}



	

	
}
