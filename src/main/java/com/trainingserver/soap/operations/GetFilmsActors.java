package com.trainingserver.soap.operations;
public class GetFilmsActors extends OperationsTemplate {
	public GetFilmsActors() {
		this.setLink("getFilmsActors");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmsActorsRequest/film_id", filmId);
	}

}