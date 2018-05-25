package com.trainingserver.operations;
public class DeleteAddress extends OperationsTemplate {
	public DeleteAddress() {
		this.setLink("deleteAddress");
		this.setup();
	}

	public void setAddressId(String addressId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteAddressRequest/address_id", addressId);
	}

}