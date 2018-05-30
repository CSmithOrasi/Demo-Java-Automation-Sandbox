package com.trainingserver.soap.operations;
public class GetRentalById extends OperationsTemplate {
	public GetRentalById() {
		this.setLink("getRentalById");
		this.setup();
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/getRentalByIdRequest/rental_id", rentalId);
	}

}