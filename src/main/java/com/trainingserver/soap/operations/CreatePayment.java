package com.trainingserver.soap.operations;
public class CreatePayment extends OperationsTemplate {
	public CreatePayment() {
		this.setLink("createPayment");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/createPaymentRequest/customer_id", customerId);
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/createPaymentRequest/staff_id", staffId);
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/createPaymentRequest/rental_id", rentalId);
	}

	public void setAmount(String amount) {
		setRequestNodeValueByXPath("/Envelope/Body/createPaymentRequest/amount", amount);
	}

	public void setPaymentDate(String paymentDate) {
		setRequestNodeValueByXPath("/Envelope/Body/createPaymentRequest/payment_date", paymentDate);
	}

}