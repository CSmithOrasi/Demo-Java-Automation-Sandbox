package com.trainingserver.operations;
public class GetFilmByRating extends OperationsTemplate {
	public GetFilmByRating() {
		this.setLink("getFilmByRating");
		this.setup();
	}

	public void setRating(String rating) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmByRatingRequest/rating", rating);
	}

}