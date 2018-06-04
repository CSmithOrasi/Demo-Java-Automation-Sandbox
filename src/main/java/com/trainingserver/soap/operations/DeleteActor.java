package com.trainingserver.soap.operations;

public class DeleteActor extends OperationsTemplate {
    public DeleteActor() {
        this.setLink("deleteActor");
        this.setup();
    }

    public void setActorId(String actorId) {
        setRequestNodeValueByXPath("/Envelope/Body/deleteActorRequest/actorId", actorId);
    }

    public Object getResponseMessage() {
        return getResponseNodeValueByXPath("/Envelope/Body/deleteActorResponse/response");
    }

}