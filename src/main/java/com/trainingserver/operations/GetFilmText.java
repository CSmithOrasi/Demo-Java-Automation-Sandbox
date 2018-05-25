package com.trainingserver.operations;
public class GetFilmText extends OperationsTemplate {
	public GetFilmText() {
		this.setLink("getFilmText");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmTextRequest/film_id", filmId);
	}

}