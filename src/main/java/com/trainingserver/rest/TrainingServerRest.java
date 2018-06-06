package com.trainingserver.rest;

import com.trainingserver.rest.actors.Actors;
import com.trainingserver.rest.films.Films;

/**
 *
 * @author christopher.smith
 *
 */
public class TrainingServerRest {
    public static final String baseURL = "https://training-server.herokuapp.com";

    public static Actors actors() {
        return new Actors();
    }

    public static Films films() {
        return new Films();
    }
}
