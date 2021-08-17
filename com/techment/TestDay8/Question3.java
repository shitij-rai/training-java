package com.techment.TestDay8;

class NameTooShortException extends Exception{
	
	String msg;

	public NameTooShortException(String msg) {
		super(msg);
	}
	
}

class Employee2 {
	String firstName , lastName;

	public Employee2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void validation() throws NameTooShortException{
		if(firstName == null || lastName == null)
			throw new NullPointerException("Entry Missing");
		
		else if(firstName.length()<3 || lastName.length()<3)
			throw new NameTooShortException("FirstName or LastName should be minimum 3 characters.");
		
		else
			System.out.println("First Name : " + firstName + ", Last Name : " + lastName);
	}
}

public class Question3 {

	public static void main(String[] args){

		Employee2 employee2 = new Employee2("Akash", "m");
		try {
			employee2.validation();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(NameTooShortException e) {
			System.out.println(e.getMessage());
		}
	}

}
