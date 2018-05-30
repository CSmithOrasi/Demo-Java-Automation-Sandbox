package com.trainingserver.soap.operations;
public class DeleteCustomer extends OperationsTemplate {
	public DeleteCustomer() {
		this.setLink("deleteCustomer");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteCustomerRequest/customer_id", customerId);
	}

}