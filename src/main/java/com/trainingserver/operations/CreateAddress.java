package com.trainingserver.operations;
public class CreateAddress extends OperationsTemplate {
	public CreateAddress() {
		this.setLink("createAddress");
		this.setup();
	}

	public void setAddress(String address) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/address", address);
	}

	public void setAddress2(String address2) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/address2", address2);
	}

	public void setDistrict(String district) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/district", district);
	}

	public void setCity(String city) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/city", city);
	}

	public void setPostalCode(String postalCode) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/postal_code", postalCode);
	}

	public void setPhone(String phone) {
		setRequestNodeValueByXPath("/Envelope/Body/createAddressRequest/phone", phone);
	}

}