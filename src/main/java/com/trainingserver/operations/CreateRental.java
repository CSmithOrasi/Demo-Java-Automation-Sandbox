package com.trainingserver.operations;
public class CreateRental extends OperationsTemplate {
	public CreateRental() {
		this.setLink("createRental");
		this.setup();
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/createRentalRequest/customer_id", customerId);
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/createRentalRequest/staff_id", staffId);
	}

	public void setInventoryId(String inventoryId) {
		setRequestNodeValueByXPath("/Envelope/Body/createRentalRequest/inventory_id", inventoryId);
	}

	public void setRentalDate(String rentalDate) {
		setRequestNodeValueByXPath("/Envelope/Body/createRentalRequest/rental_date", rentalDate);
	}

	public void setRetuRnDate(String returnDate) {
		setRequestNodeValueByXPath("/Envelope/Body/createRentalRequest/return_date", returnDate);
	}

}