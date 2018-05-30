package com.trainingserver.soap.operations;
public class GetInventoryById extends OperationsTemplate {
	public GetInventoryById() {
		this.setLink("getInventoryById");
		this.setup();
	}

	public void setInventoryId(String inventoryId) {
		setRequestNodeValueByXPath("/Envelope/Body/getInventoryByIdRequest/inventory_id", inventoryId);
	}

}