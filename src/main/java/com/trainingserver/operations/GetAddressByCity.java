package com.trainingserver.operations;
public class GetAddressByCity extends OperationsTemplate {
	public GetAddressByCity() {
		this.setLink("getAddressByCity");
		this.setup();
	}

	public void setCityName(String cityName) {
		setRequestNodeValueByXPath("/Envelope/Body/getAddressByCityRequest/city_name", cityName);
	}

}