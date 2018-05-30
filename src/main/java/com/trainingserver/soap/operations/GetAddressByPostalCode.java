package com.trainingserver.soap.operations;
public class GetAddressByPostalCode extends OperationsTemplate {
	public GetAddressByPostalCode() {
		this.setLink("getAddressByPostalCode");
		this.setup();
	}

	public void setPostalCode(String postalCode) {
		setRequestNodeValueByXPath("/Envelope/Body/getAddressByPostalCodeRequest/postal_code", postalCode);
	}

}