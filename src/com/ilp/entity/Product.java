package com.ilp.entity;

import java.util.*;

public abstract class Product {

	private String productCode;
	private String productName;
	private ArrayList<Service> serviceList;

	public Product(String productCode, String productName, ArrayList<Service> serviceList) {
		this.productCode = productCode;
		this.productName = productName;
		this.serviceList = serviceList;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ArrayList<Service> getserviceList() {
		return serviceList;
	}

	public void setServiceList(ArrayList<Service> serviceList) {
		this.serviceList = serviceList;
	}

}
