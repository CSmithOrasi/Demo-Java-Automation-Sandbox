package com.trainingserver.soap.operations;
public class GetRentalByReturnDate extends OperationsTemplate {
	public GetRentalByReturnDate() {
		this.setLink("getRentalByReturnDate");
		this.setup();
	}

	public void setRetuRnDate(String returnDate) {
		setRequestNodeValueByXPath("/Envelope/Body/getRentalByReturnDateRequest/return_date", returnDate);
	}

}