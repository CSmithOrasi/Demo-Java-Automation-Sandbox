package com.trainingserver.operations;
public class GetLanguageByName extends OperationsTemplate {
	public GetLanguageByName() {
		this.setLink("getLanguageByName");
		this.setup();
	}

	public void setLanguageName(String languageName) {
		setRequestNodeValueByXPath("/Envelope/Body/getLanguageByNameRequest/language_name", languageName);
	}

}