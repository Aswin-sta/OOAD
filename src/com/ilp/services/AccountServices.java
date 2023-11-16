package com.ilp.services;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsAccount;

public class AccountServices {

	public static void displayBalance(Account account) {

		System.out.println("Balance : " + account.getAccountBalance());

	}

	public static void withdrawMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to  withdraw");
		double withdrawalAmount = scanner.nextDouble();
		Double remainingBalance = account.getAccountBalance() - withdrawalAmount;
		if (account.getAccountType() instanceof SavingsAccount) {
			SavingsAccount product  = (SavingsAccount) account.getAccountType();

			if (remainingBalance >= product.getMinBalance()) {
				account.setAccountBalance(remainingBalance);
			} else {
				System.out.println("Cannot withdraw money");
			}

		} else {
			if (remainingBalance >= 0) {
				account.setAccountBalance(remainingBalance);
			} else {
				System.out.println("Cannot withdraw money");
			}
		}

	}

	public static void depositMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		double depositAmount = scanner.nextDouble();
		System.out.println("do you prefer cheque deposit (y/n)");
		char checkDeposit = scanner.next().charAt(0);
		if (Character.toLowerCase(checkDeposit) == 'y' && account.getAccountType() instanceof LoanAccount) {
			LoanAccount product=(LoanAccount)account.getAccountType();
			account.setAccountBalance(account.getAccountBalance() + ((100-product.getDepositDepreciation())* depositAmount));
		} else
			account.setAccountBalance(account.getAccountBalance() + depositAmount);
	}

}
