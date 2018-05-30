package com.trainingserver.soap.operations;
public class GetActorsByFirstName extends OperationsTemplate {
	public GetActorsByFirstName() {
		this.setLink("getActorsByFirstName");
		this.setup();
	}

	public void setActorFirst_nAme(String actorFirst_name) {
		setRequestNodeValueByXPath("/Envelope/Body/getActorsByFirstNameRequest/actor_first_name", actorFirst_name);
	}

}