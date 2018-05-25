package com.trainingserver.operations;
public class GetStoreInventory extends OperationsTemplate {
	public GetStoreInventory() {
		this.setLink("getStoreInventory");
		this.setup();
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/getStoreInventoryRequest/store_id", storeId);
	}

}