package com.trainingserver.rest.actors;

import com.orasi.api.restServices.RestService;
import com.trainingserver.rest.TrainingServerRest;

public class Actors {
    private RestService restService = new RestService();
    private String path = TrainingServerRest.baseURL + "/rest/actors";

    // COMP:
    // public RestResponse createRegister(Request request) {
    // return restService.sendPostRequest(path, HeaderType.JSON, RestService.getJsonFromObject(request));
    // }
}
