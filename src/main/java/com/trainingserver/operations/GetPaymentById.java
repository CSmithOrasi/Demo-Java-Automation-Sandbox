package com.trainingserver.operations;
public class GetPaymentById extends OperationsTemplate {
	public GetPaymentById() {
		this.setLink("getPaymentById");
		this.setup();
	}

	public void setPaymentId(String paymentId) {
		setRequestNodeValueByXPath("/Envelope/Body/getPaymentByIdRequest/payment_id", paymentId);
	}

}