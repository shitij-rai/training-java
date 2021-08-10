package com.techment.OopsAssignment;

class CustomerQuestion4{
	
	String customerName;
	AddressQuestion4 residentialAddress;
	AddressQuestion4 officialAddress;
	
	public CustomerQuestion4() {
		System.out.println("This is default constructor of Customer");
	}
	
	public CustomerQuestion4(String customerName, AddressQuestion4 residentialAddress , AddressQuestion4 officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
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

	public void setResidentialAddress(AddressQuestion4 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public String getOfficialAddress() {
		return officialAddress.getAddressDetails();
	}

	public void setOfficialAddress(AddressQuestion4 officialAddress) {
		this.officialAddress = officialAddress;
	}
	
	String getCustomerDetails() {
		return "Customer : " + customerName + "\nResidential Address : " + residentialAddress.getAddressDetails() + "\nOfficial Address : " + officialAddress.getAddressDetails();		
	}
}

class AddressQuestion4{
	
	private String addressLine , city;

	public AddressQuestion4(String addressLine, String city) {
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
		return addressLine + " , " + city ;
	}
	
}

public class Question4 {

	public static void main(String[] args) {

		AddressQuestion4 residence = new AddressQuestion4("144 Ambian Apartments", "Chennai");
		AddressQuestion4 officeAddress = new AddressQuestion4("230 G-Block Tech Park", "Chennai");
		
		CustomerQuestion4 person1 = new CustomerQuestion4("Ramesh", residence, officeAddress);
	    System.out.println(person1.getCustomerDetails());
		
	}

}
