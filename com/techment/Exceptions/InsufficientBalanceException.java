package com.techment.Exceptions;

class Account{

	int balance = 5000;
	
	String withdraw(int amount) {
		if(amount>balance)
			throw new InsufficientBalanceException("Insufficient Fund.");
		else
			return "You have withdrawn " + amount ;
	}
}

public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		
		try {
			System.out.println(account.withdraw(10000));
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}


