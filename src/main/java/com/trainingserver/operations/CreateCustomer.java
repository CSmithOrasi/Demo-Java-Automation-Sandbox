package com.trainingserver.operations;
public class CreateCustomer extends OperationsTemplate {
	public CreateCustomer() {
		this.setLink("createCustomer");
		this.setup();
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/store_id", storeId);
	}

	public void setFirstName(String firstName) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/first_name", firstName);
	}

	public void setLastName(String lastName) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/last_name", lastName);
	}

	public void setEmail(String email) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/email", email);
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/address_id", addressId);
	}

	public void setActive(String active) {
		setRequestNodeValueByXPath("/Envelope/Body/createCustomerRequest/active", active);
	}

}