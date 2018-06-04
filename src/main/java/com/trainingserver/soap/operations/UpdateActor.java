package com.trainingserver.soap.operations;

public class UpdateActor extends OperationsTemplate {
    public UpdateActor() {
        this.setLink("updateActor");
        this.setup();
    }

    public void setActorId(String actorId) {
        setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/actorId", actorId);
    }

    public void setNewFirstName(String newFirstName) {
        setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/newFirstName", newFirstName);
    }

    public void setNewLastName(String newLastName) {
        setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/newLastName", newLastName);
    }

    public String getResponseActorId() {
        return getResponseNodeValueByXPath("/Envelope/Body/updateActorResponse/actor/actorId");
    }

    public String getResponseFirstName() {
        return getResponseNodeValueByXPath("/Envelope/Body/updateActorResponse/actor/firstName");
    }

    public String getResponseLastName() {
        return getResponseNodeValueByXPath("/Envelope/Body/updateActorResponse/actor/lastName");
    }
}