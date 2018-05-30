package com.trainingserver.soap.operations;
public class UpdateAddress extends OperationsTemplate {
	public UpdateAddress() {
		this.setLink("updateAddress");
		this.setup();
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/address_id", addressId);
	}

	public void setAddress(String address) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/address", address);
	}

	public void setAddress2(String address2) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/address2", address2);
	}

	public void setDistrict(String district) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/district", district);
	}

	public void setCity(String city) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/city", city);
	}

	public void setPostalCode(String postalCode) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/postal_code", postalCode);
	}

	public void setPhone(String phone) {
		setRequestNodeValueByXPath("/Envelope/Body/updateAddressRequest/phone", phone);
	}

}