package com.trainingserver.operations;
public class UpdateStaff extends OperationsTemplate {
	public UpdateStaff() {
		this.setLink("updateStaff");
		this.setup();
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/staff_id", staffId);
	}

	public void setFirstName(String firstName) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/first_name", firstName);
	}

	public void setLastName(String lastName) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/last_name", lastName);
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/address_id", addressId);
	}

	public void setEmail(String email) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/email", email);
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/store_id", storeId);
	}

	public void setActive(String active) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/active", active);
	}

	public void setUsername(String username) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/username", username);
	}

	public void setPassword(String password) {
		setRequestNodeValueByXPath("/Envelope/Body/updateStaffRequest/password", password);
	}

}