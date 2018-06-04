package com.trainingserver.soap.operations;

public class GetAllActors extends OperationsTemplate {
    public GetAllActors() {
        this.setLink("getAllActors");
        this.setup();
    }

    public String getFirstActorId() {
        return getResponseNodeValueByXPath("/Envelope/Body/getAllActorsResponse/actor/actorId[text()='1']");
    }
}