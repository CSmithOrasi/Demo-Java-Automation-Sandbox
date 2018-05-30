package com.trainingserver.soap.operations;
public class GetPaymentsForRental extends OperationsTemplate {
	public GetPaymentsForRental() {
		this.setLink("getPaymentsForRental");
		this.setup();
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/getPaymentsForRentalRequest/rental_id", rentalId);
	}

}