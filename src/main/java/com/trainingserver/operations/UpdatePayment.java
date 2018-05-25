package com.trainingserver.operations;
public class UpdatePayment extends OperationsTemplate {
	public UpdatePayment() {
		this.setLink("updatePayment");
		this.setup();
	}

	public void setPaymentId(String paymentId) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/payment_id", paymentId);
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/customer_id", customerId);
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/staff_id", staffId);
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/rental_id", rentalId);
	}

	public void setAmount(String amount) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/amount", amount);
	}

	public void setPaymentDate(String paymentDate) {
		setRequestNodeValueByXPath("/Envelope/Body/updatePaymentRequest/payment_date", paymentDate);
	}

}