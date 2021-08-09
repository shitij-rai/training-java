package com.techment.fundamentalsPractice;

class Customers{
	
	int cust_id;
	String cust_name;
	Account account;
	
	public Customers(int cust_id, String cust_name, Account account) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.account = account;
	}
	
	void dislpayCustomerDetails() {
		System.out.println("Customer id : "+ cust_id);
		System.out.println("Customer Name : "+ cust_name);
		System.out.println("Account No. : "+ account.account_no);
		System.out.println("Account Balance : "+ account.balance + " INR");
		System.out.println("Account Type : "+ account.account_type);
		System.out.println("Account IFSC : "+ account.ifsc);
		System.out.println("Account Branch : "+ account.branch);
	}
}

class Account{
	int account_no , balance;
	String account_type , ifsc , branch;
	
	public Account(int account_no, int balance, String account_type, String ifsc, String branch) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.account_type = account_type;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
}

public class CustomerAccount {

	public static void main(String[] args) {

		Account account = new Account(456123799, 2500, "Savings", "AXIS1BHILAI", "Bhilai");
		Customers customer1 = new Customers(77, "Shyam", account);
		customer1.dislpayCustomerDetails();
	}

}
