package com.techment.OopsAssignment;

class Customer{
	
	String customerName;
	Address residentialAddress;
	
	public Customer() {
		System.out.println("This is default constructor of Customer");
	}
	
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getResidentialAddress() {
		return residentialAddress.getAddressDetails();
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	String getCustomerDetails() {
		return "Customer : " + customerName + "\nResidential Address : " + residentialAddress.getAddressDetails();		
	}
}

class Address{
	private String addressLine , city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	String getAddressDetails() {
		return addressLine + " ," + city ;
	}
	
}

public class Question1 {

	public static void main(String[] args) {

		Address address = new Address("144 Sky Apartments", "Pune");
		
		Customer customer = new Customer();
		customer.setCustomerName("Jay");
		customer.setResidentialAddress(address);
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getResidentialAddress());
		
		Address address2 = new Address("Ist Main HSR Layout", "Banglore");
		Customer customer2 = new Customer("John", address2);
		System.out.println(customer2.getCustomerDetails());
		
	}

}
