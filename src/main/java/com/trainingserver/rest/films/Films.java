package com.trainingserver.rest.films;

import com.orasi.api.restServices.Headers.HeaderType;
import com.orasi.api.restServices.RestResponse;
import com.orasi.api.restServices.RestService;
import com.trainingserver.rest.TrainingServerRest;
import com.trainingserver.rest.films.objects.Film;

/**
 *
 * @author christopher.smith
 *
 */
public class Films {
    private RestService restService = new RestService();
    private String path = TrainingServerRest.baseURL + "/rest/films/";

    public RestResponse getAllFilms() {
        return restService.sendGetRequest(path, HeaderType.JSON);
    }

    public RestResponse getFilmById(Film film) {
        return restService.sendGetRequest(path + film.getFilmId(), HeaderType.JSON);
    }

    public RestResponse createFilm(Film film) {
        return restService.sendPostRequest(path, HeaderType.JSON, RestService.getJsonFromObject(film));
    }

    public RestResponse updateFilm(Film film) {
        return restService.sendPutRequest(path + film.getFilmId(), HeaderType.JSON, RestService.getJsonFromObject(film));
    }

    public RestResponse deleteFilm(Film film) {
        return restService.sendDeleteRequest(path + film.getFilmId());
    }

}
