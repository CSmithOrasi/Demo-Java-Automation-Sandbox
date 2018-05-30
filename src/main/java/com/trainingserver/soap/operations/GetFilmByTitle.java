package com.trainingserver.soap.operations;
public class GetFilmByTitle extends OperationsTemplate {
	public GetFilmByTitle() {
		this.setLink("getFilmByTitle");
		this.setup();
	}

	public void setTiTle(String title) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmByTitleRequest/title", title);
	}

}