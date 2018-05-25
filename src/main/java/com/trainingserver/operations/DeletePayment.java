package com.trainingserver.operations;
public class DeletePayment extends OperationsTemplate {
	public DeletePayment() {
		this.setLink("deletePayment");
		this.setup();
	}

	public void setPaymentId(String paymentId) {
		setRequestNodeValueByXPath("/Envelope/Body/deletePaymentRequest/payment_id", paymentId);
	}

}