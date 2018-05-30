package com.trainingserver.soap.operations;
public class UpdateCustomer extends OperationsTemplate {
	public UpdateCustomer() {
		this.setLink("updateCustomer");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/customer_id", customerId);
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/store_id", storeId);
	}

	public void setFirstName(String firstName) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/first_name", firstName);
	}

	public void setLastName(String lastName) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/last_name", lastName);
	}

	public void setEmail(String email) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/email", email);
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/address_id", addressId);
	}

	public void setActive(String active) {
		setRequestNodeValueByXPath("/Envelope/Body/updateCustomerRequest/active", active);
	}

}