package com.trainingserver.soap.operations;
public class UpdateInventory extends OperationsTemplate {
	public UpdateInventory() {
		this.setLink("updateInventory");
		this.setup();
	}

	public void setInventoryId(String inventoryId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateInventoryRequest/inventory_id", inventoryId);
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateInventoryRequest/film_id", filmId);
	}

	public void setStoreId(String storeId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateInventoryRequest/store_id", storeId);
	}

}