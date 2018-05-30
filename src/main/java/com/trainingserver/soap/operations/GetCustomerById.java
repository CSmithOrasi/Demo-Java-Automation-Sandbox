package com.trainingserver.soap.operations;
public class GetCustomerById extends OperationsTemplate {
	public GetCustomerById() {
		this.setLink("getCustomerById");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/getCustomerByIdRequest/customer_id", customerId);
	}

}