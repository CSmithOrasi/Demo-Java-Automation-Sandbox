package com.trainingserver.soap.operations;
public class GetAddressById extends OperationsTemplate {
	public GetAddressById() {
		this.setLink("getAddressById");
		this.setup();
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/getAddressByIdRequest/address_id", addressId);
	}

}