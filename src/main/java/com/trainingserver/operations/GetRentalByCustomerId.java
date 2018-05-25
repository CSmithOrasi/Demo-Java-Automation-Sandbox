package com.trainingserver.operations;
public class GetRentalByCustomerId extends OperationsTemplate {
	public GetRentalByCustomerId() {
		this.setLink("getRentalByCustomerId");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/getRentalByCustomerIdRequest/customer_id", customerId);
	}

}