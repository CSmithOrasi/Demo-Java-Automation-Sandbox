package com.trainingserver.operations;
public class GetCustomersByStore extends OperationsTemplate {
	public GetCustomersByStore() {
		this.setLink("getCustomersByStore");
		this.setup();
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/getCustomersByStoreRequest/store_id", storeId);
	}

}