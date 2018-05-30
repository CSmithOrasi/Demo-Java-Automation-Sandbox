package com.trainingserver.soap.operations;
public class CreateInventory extends OperationsTemplate {
	public CreateInventory() {
		this.setLink("createInventory");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/createInventoryRequest/film_id", filmId);
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/createInventoryRequest/store_id", storeId);
	}

}