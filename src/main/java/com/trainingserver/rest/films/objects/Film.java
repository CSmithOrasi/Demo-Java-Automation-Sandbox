package com.trainingserver.rest.films.objects;

import com.trainingserver.rest.actors.objects.Actor;
import com.trainingserver.rest.objects.RestObject;

public class Film extends RestObject {
    private int filmId;
    private String title;
    private String description;
    private int releaseYear;
    private String language;
    private String originalLanguage;
    private int rentalDuration;
    private double rentalRate;
    private int length;
    private double replacementCost;
    private String rating;
    private String specialFeatures;
    private String category;
    private Actor[] actors;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj) {
    // return true;
    // } else if (obj == null) {
    // return false;
    // } else if (obj instanceof Film) {
    // Film film = (Film) obj;
    // if (
    // this.filmId == film.getFilmId() &&
    // this.actors.equals(film.getActors()) &&
    //
    // ) {
    // return true;
    // }
    // }
    // return false;
    // }

    // public List<ResultObject> compareFields(SampleObject object) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    // List<ResultObject> resultList = new ArrayList<ResultObject>();
    // Field[] fields = this.getClass().getDeclaredFields();
    //
    // for(Field field : fields){
    // if(!field.get(this).equals(field.get(object))){
    // ResultObject resultObject = new ResultObject();
    // resultObject.setFieldName(field.getName());
    // resultObject.setOldObjectValue(field.get(this).toString());
    // resultObject.setNewObjectValue(field.get(object).toString());
    // resultList.add(resultObject);
    // }
    // }
    // return resultList;
    // }

    // @Override
    // public boolean equals(Object obj) {
    // Film film;
    //
    // if (!(obj instanceof Film)) {
    // return false;
    // } else {
    // film = (Film) obj;
    // }
    //
    // Field[] fields = this.getClass().getDeclaredFields();
    //
    // for (Field field : fields) {
    //
    // try {
    // if (field.getType() == Actor[].class) {
    // Actor[] theseActors = (Actor[]) field.get(this);
    // Actor[] thoseActors = (Actor[]) field.get(film);
    //
    // if (theseActors != null && thoseActors != null) {
    // if (theseActors.length != thoseActors.length) {
    // return false;
    // }
    //
    // if (theseActors.length == 0) {
    // continue;
    // }
    //
    // for (int i = 0; i < theseActors.length; i++) {
    // if (theseActors[i] == null && thoseActors[i] == null) {
    // continue;
    // }
    // if (theseActors[i] != null && thoseActors[i] == null ||
    // theseActors[i] == null && thoseActors[i] != null ||
    // !theseActors[i].equals(thoseActors[i])) {
    // return false;
    // }
    // }
    // } else if (theseActors == null && thoseActors == null) {
    // continue;
    // } else if (theseActors == null || thoseActors == null) {
    // return false;
    // }
    // }
    //
    // if (field.get(film) != null && field.get(this) != null) {
    // if (!field.get(this).equals(field.get(film))) {
    // return false;
    // }
    // } else if (field.get(film) == null && field.get(this) == null) {
    // continue;
    // } else if (field.get(film) == null || field.get(this) == null) {
    // return false;
    // }
    // } catch (IllegalArgumentException | IllegalAccessException e) {
    // return false;
    // }
    // }
    //
    // return true;
    // }

}
