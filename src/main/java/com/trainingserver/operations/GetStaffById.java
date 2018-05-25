package com.trainingserver.operations;
public class GetStaffById extends OperationsTemplate {
	public GetStaffById() {
		this.setLink("getStaffById");
		this.setup();
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/getStaffByIdRequest/staff_id", staffId);
	}

}