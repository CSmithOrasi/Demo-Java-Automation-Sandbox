package com.trainingserver.rest;

import com.trainingserver.rest.actors.Actors;

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
}
