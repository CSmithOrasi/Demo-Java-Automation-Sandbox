package com.trainingserver.operations;
public class GetRentalByStartDate extends OperationsTemplate {
	public GetRentalByStartDate() {
		this.setLink("getRentalByStartDate");
		this.setup();
	}

	public void setRentalStaRt_date(String rentalStart_date) {
		setRequestNodeValueByXPath("/Envelope/Body/getRentalByStartDateRequest/rental_start_date", rentalStart_date);
	}

}