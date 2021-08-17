package com.techment.ExceptionAssignment;

class Customer{
	private String custNo , custName , category;

	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

	public void validateCustNo() throws InvalidInputException{
		if(!custNo.toLowerCase().startsWith("c"))
			throw new InvalidInputException("custNo must start with 'C' or 'c'.");
	}
	
	public void validateCustName() throws InvalidInputException{
		if(custName.length()<4)
			throw new InvalidInputException("custName must be of atleast 4 characters.");
	}
	
	public void validateCategory() throws InvalidInputException{
		if(   !(category.equalsIgnoreCase("platinum") || category.equalsIgnoreCase("silver") || category.equalsIgnoreCase("gold"))  )
			throw new InvalidInputException("category must be either Platinum' , 'Gold' or 'Silver'");
	}
}

class InvalidInputException extends Exception{
	String msg;

	public InvalidInputException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
} 

public class Question2 {

	public static void main(String[] args) {

		Customer customer = new Customer("C1234", "abcd", "bronze");
		try {
			customer.validateCustNo();
			System.out.println("custNo = " + customer.getCustNo());
			customer.validateCustName();
			System.out.println("custName = " + customer.getCustName());
			customer.validateCategory();
			System.out.println("category = " + customer.getCategory());
		}
		catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
	}

}
