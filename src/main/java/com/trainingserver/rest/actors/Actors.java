package com.trainingserver.rest.actors;

import com.orasi.api.restServices.Headers.HeaderType;
import com.orasi.api.restServices.RestResponse;
import com.orasi.api.restServices.RestService;
import com.trainingserver.rest.TrainingServerRest;
import com.trainingserver.rest.actors.objects.ActorListing;

public class Actors {
    private RestService restService = new RestService();
    private String path = TrainingServerRest.baseURL + "/rest/actors";

    public RestResponse getAllActors() {
        return restService.sendGetRequest(path + "/", HeaderType.JSON);
    }

    public RestResponse getActorsByFirstName(ActorListing actor) {
        return restService.sendGetRequest(path + "/first_name/" + actor.getFirstName(), HeaderType.JSON);
    }

    public RestResponse createActor(ActorListing actor) {
        return restService.sendPutRequest(path + "/create", HeaderType.JSON, RestService.getJsonFromObject(actor));
    }

    public RestResponse deleteActor(ActorListing actor) {
        return restService.sendDeleteRequest(path + "/" + actor.getActorId() + "/delete", HeaderType.JSON);
    }

    public RestResponse updateActor(ActorListing actor) {
        return restService.sendPostRequest(path + "/" + actor.getActorId() + "/update", HeaderType.JSON, RestService.getJsonFromObject(actor));
    }
}
