package com.ilp.entity;

import java.util.ArrayList;

public class LoanAccount extends Product {

	
	private double depositDepreciation=0.03;
	
	public LoanAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
		// TODO Auto-generated constructor stub
	}

	public double getDepositDepreciation() {
		return depositDepreciation;
	}

	public void setDepositDepreciation(double depositDepreciation) {
		this.depositDepreciation = depositDepreciation;
	}




	
}
