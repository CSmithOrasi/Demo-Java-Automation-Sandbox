package com.trainingserver.rest.actors;

import com.orasi.api.restServices.Headers.HeaderType;
import com.orasi.api.restServices.RestResponse;
import com.orasi.api.restServices.RestService;
import com.trainingserver.rest.TrainingServerRest;
import com.trainingserver.rest.actors.objects.Actor;

/**
 *
 * @author christopher.smith
 *
 */
public class Actors {
    private RestService restService = new RestService();
    private String path = TrainingServerRest.baseURL + "/rest/actors";

    public RestResponse getAllActors() {
        return restService.sendGetRequest(path + "/", HeaderType.JSON);
    }

    public RestResponse getActorsByFirstName(Actor actor) {
        return restService.sendGetRequest(path + "/first_name/" + actor.getFirstName(), HeaderType.JSON);
    }

    public RestResponse createActor(Actor actor) {
        return restService.sendPostRequest(path, HeaderType.JSON, RestService.getJsonFromObject(actor));
    }

    public RestResponse deleteActor(Actor actor) {
        return restService.sendDeleteRequest(path + "/" + actor.getActorId(), HeaderType.JSON);
    }

    public RestResponse updateActor(Actor actor) {
        return restService.sendPutRequest(path + "/" + actor.getActorId(), HeaderType.JSON, RestService.getJsonFromObject(actor));
    }
}
