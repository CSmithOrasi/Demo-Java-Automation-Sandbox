package com.trainingserver.soap.operations;
public class DeleteInventory extends OperationsTemplate {
	public DeleteInventory() {
		this.setLink("deleteInventory");
		this.setup();
	}

	public void setInventoryId(String inventoryId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteInventoryRequest/inventory_id", inventoryId);
	}

}