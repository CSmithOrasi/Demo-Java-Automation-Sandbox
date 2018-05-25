package com.trainingserver.operations;
public class GetFilmById extends OperationsTemplate {
	public GetFilmById() {
		this.setLink("getFilmById");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmByIdRequest/film_id", filmId);
	}

}