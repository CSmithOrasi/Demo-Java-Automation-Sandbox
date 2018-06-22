package com.trainingserver.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orasi.api.restServices.RestResponse;
import com.orasi.utils.TestReporter;
import com.trainingserver.rest.actors.objects.Actor;
import com.trainingserver.rest.films.objects.Film;

/**
 *
 * @author christopher.smith
 *
 */
public class TestFilms {
    private Film film;

    @BeforeClass
    public void activateLogging() {
        // TestReporter.setDebugLevel(TestReporter.TRACE);
        // TestReporter.setPrintToConsole(true);
    }

    @Test
    public void testGetAllFilms() {
        RestResponse response = TrainingServerRest.films().getAllFilms();

        Film[] films = response.mapJSONToObject(Film[].class);

        for (Film film : films) {
            System.out.println(film.getTitle());
            for (Actor actor : film.getActors()) {
                System.out.println("\t" + actor.getFirstName() + " " + actor.getLastName());
            }
        }
    }

    @Test
    public void testCreateFilm() {
        String title = "FAKE FILM";
        String description = "Not really a film.";
        String language = "English";
        String rating = "PG";
        String specialFeatures = "{}";
        int releaseYear = 2000;
        Actor actor = new Actor();
        actor.setActorId(1);
        Actor[] actors = { actor };

        film = new Film();
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguage(language);
        film.setOriginalLanguage(language);
        film.setRating(rating);
        film.setSpecialFeatures(specialFeatures);
        film.setReleaseYear(releaseYear);
        film.setActors(actors);

        RestResponse response = TrainingServerRest.films().createFilm(film);
        film = response.mapJSONToObject(Film.class);

        TestReporter.assertEquals(title, film.getTitle(), "title of new film == request title");
        TestReporter.assertEquals(description, film.getDescription(), "description of new film == request description");
        TestReporter.assertEquals(language, film.getLanguage(), "language of new film == request language");
        TestReporter.assertEquals(language, film.getOriginalLanguage(), "original language of new film == request original language");
        TestReporter.assertEquals(rating, film.getRating(), "rating of new film == request rating");
        TestReporter.assertEquals(specialFeatures, film.getSpecialFeatures(), "special features of new film == request special features");
        TestReporter.assertEquals(releaseYear, film.getReleaseYear(), "release year of new film == request release year");
    }

    @Test(dependsOnMethods = "testCreateFilm")
    public void testUpdateFilm() {
        String newTitle = "FORK FORM";
        film.setTitle(newTitle);

        RestResponse response = TrainingServerRest.films().updateFilm(film);
        film = response.mapJSONToObject(Film.class);

        TestReporter.assertEquals(newTitle, film.getTitle(), "listing title was updated");
    }

    @Test(dependsOnMethods = "testUpdateFilm")
    public void testDeleteFilm() {
        RestResponse response = TrainingServerRest.films().deleteFilm(film);
        TestReporter.assertEquals("Film [" + film.getFilmId() + "] was deleted", response.getResponse(), "valid delete film response");

        response = TrainingServerRest.films().getFilmById(film);
        TestReporter.assertEquals(500, response.getStatusCode(), "get deleted film returns status code 500");
    }
}
