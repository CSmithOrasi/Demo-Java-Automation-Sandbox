package com.trainingserver.operations;
public class CreateStaff extends OperationsTemplate {
	public CreateStaff() {
		this.setLink("createStaff");
		this.setup();
	}

	public void setFirstName(String firstName) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/first_name", firstName);
	}

	public void setLastName(String lastName) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/last_name", lastName);
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/address_id", addressId);
	}

	public void setEmail(String email) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/email", email);
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/store_id", storeId);
	}

	public void setActive(String active) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/active", active);
	}

	public void setUsername(String username) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/username", username);
	}

	public void setPassword(String password) {
		setRequestNodeValueByXPath("/Envelope/Body/createStaffRequest/password", password);
	}

}