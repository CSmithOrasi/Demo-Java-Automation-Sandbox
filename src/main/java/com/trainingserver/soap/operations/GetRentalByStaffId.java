package com.trainingserver.soap.operations;
public class GetRentalByStaffId extends OperationsTemplate {
	public GetRentalByStaffId() {
		this.setLink("getRentalByStaffId");
		this.setup();
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/getRentalByStaffIdRequest/staff_id", staffId);
	}

}