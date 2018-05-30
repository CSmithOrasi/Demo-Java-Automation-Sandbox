package com.trainingserver.soap.operations;
public class UpdateRental extends OperationsTemplate {
	public UpdateRental() {
		this.setLink("updateRental");
		this.setup();
	}

	public void setRentalId(String rentalId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/rental_id", rentalId);
	}

	public void setCustomerId(String customerId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/customer_id", customerId);
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/staff_id", staffId);
	}

	public void setInventoryId(String inventoryId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/inventory_id", inventoryId);
	}

	public void setRentalDate(String rentalDate) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/rental_date", rentalDate);
	}

	public void setRetuRnDate(String returnDate) {
		setRequestNodeValueByXPath("/Envelope/Body/updateRentalRequest/return_date", returnDate);
	}

}