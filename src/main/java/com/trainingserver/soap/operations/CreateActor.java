package com.trainingserver.soap.operations;

public class CreateActor extends OperationsTemplate {
    public CreateActor() {
        this.setLink("createActor");
        this.setup();
    }

    public void setFirstName(String firstName) {
        setRequestNodeValueByXPath("/Envelope/Body/createActorRequest/firstName", firstName);
    }

    public void setLastName(String lastName) {
        setRequestNodeValueByXPath("/Envelope/Body/createActorRequest/lastName", lastName);
    }

    public String getActorId() {
        return getResponseNodeValueByXPath("/Envelope/Body/createActorResponse/actor/actorId");
    }

    public String getResponseFirstName() {
        return getResponseNodeValueByXPath("/Envelope/Body/createActorResponse/actor/firstName");
    }

    public String getResponseLastName() {
        return getResponseNodeValueByXPath("/Envelope/Body/createActorResponse/actor/lastName");
    }
}