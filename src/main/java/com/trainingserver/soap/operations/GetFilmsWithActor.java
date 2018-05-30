package com.trainingserver.soap.operations;
public class GetFilmsWithActor extends OperationsTemplate {
	public GetFilmsWithActor() {
		this.setLink("getFilmsWithActor");
		this.setup();
	}

	public void setActorId(String actorId) {
		setRequestNodeValueByXPath("/Envelope/Body/getFilmsWithActorRequest/actor_id", actorId);
	}

}