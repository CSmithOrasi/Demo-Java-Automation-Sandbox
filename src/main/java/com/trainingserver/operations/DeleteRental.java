package com.trainingserver.operations;
public class DeleteRental extends OperationsTemplate {
	public DeleteRental() {
		this.setLink("deleteRental");
		this.setup();
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteRentalRequest/rental_id", rentalId);
	}

}