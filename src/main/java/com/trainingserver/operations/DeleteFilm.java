package com.trainingserver.operations;
public class DeleteFilm extends OperationsTemplate {
	public DeleteFilm() {
		this.setLink("deleteFilm");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteFilmRequest/film_id", filmId);
	}

}