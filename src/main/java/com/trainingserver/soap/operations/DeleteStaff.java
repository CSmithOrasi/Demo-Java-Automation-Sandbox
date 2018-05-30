package com.trainingserver.soap.operations;
public class DeleteStaff extends OperationsTemplate {
	public DeleteStaff() {
		this.setLink("deleteStaff");
		this.setup();
	}

	public void setStaffId(String staffId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteStaffRequest/staff_id", staffId);
	}

}