package com.trainingserver.soap.operations;
public class GetFilmByReleaseYear extends OperationsTemplate {
	public GetFilmByReleaseYear() {
		this.setLink("getFilmByReleaseYear");
		this.setup();
	}

	public void setReleaseYeaR(String releaseYear) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmByReleaseYearRequest/release_year", releaseYear);
	}

}