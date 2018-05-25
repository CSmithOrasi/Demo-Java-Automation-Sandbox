package com.trainingserver.operations;
public class CreateFilm extends OperationsTemplate {
	public CreateFilm() {
		this.setLink("createFilm");
		this.setup();
	}

	public void setTiTle(String title) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/title", title);
	}

	public void setDescription(String description) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/description", description);
	}

	public void setReleaseYeaR(String releaseYear) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/release_year", releaseYear);
	}

	public void setLanguageId(String languageId) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/language_id", languageId);
	}

	public void setOriginalLanguage(String originalLanguage) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/original_language", originalLanguage);
	}

	public void setRentalDuRation(String rentalDuration) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/rental_duration", rentalDuration);
	}

	public void setRentalRate(String rentalRate) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/rental_rate", rentalRate);
	}

	public void setLength(String length) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/length", length);
	}

	public void setReplacementCost(String replacementCost) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/replacement_cost", replacementCost);
	}

	public void setRating(String rating) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/rating", rating);
	}

	public void setSpecialFeatureS(String specialFeatures) {
		setRequestNodeValueByXPath("/Envelope/Body/createFilmRequest/special_features", specialFeatures);
	}

}