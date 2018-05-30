package com.trainingserver.soap.operations;
public class UpdateFilm extends OperationsTemplate {
	public UpdateFilm() {
		this.setLink("updateFilm");
		this.setup();
	}

	public void setFilmId(String filmId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/film_id", filmId);
	}

	public void setTiTle(String title) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/title", title);
	}

	public void setDescription(String description) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/description", description);
	}

	public void setReleaseYeaR(String releaseYear) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/release_year", releaseYear);
	}

	public void setLanguage(String language) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/language", language);
	}

	public void setOriginalLanguage(String originalLanguage) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/original_language", originalLanguage);
	}

	public void setRentalDuRation(String rentalDuration) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/rental_duration", rentalDuration);
	}

	public void setRentalRate(String rentalRate) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/rental_rate", rentalRate);
	}

	public void setLength(String length) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/length", length);
	}

	public void setReplacementCost(String replacementCost) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/replacement_cost", replacementCost);
	}

	public void setRating(String rating) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/rating", rating);
	}

	public void setSpecialFeatureS(String specialFeatures) {
		setRequestNodeValueByXPath("/Envelope/Body/updateFilmRequest/special_features", specialFeatures);
	}

}