package com.trainingserver.soap.operations;
public class GetPaymentsFromCustomer extends OperationsTemplate {
	public GetPaymentsFromCustomer() {
		this.setLink("getPaymentsFromCustomer");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/getPaymentsFromCustomerRequest/customer_id", customerId);
	}

}