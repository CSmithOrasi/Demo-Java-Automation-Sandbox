package com.trainingserver.operations;
public class GetActorsById extends OperationsTemplate {
	public GetActorsById() {
		this.setLink("getActorsById");
		this.setup();
	}

	public void setActorId(String actorId) {
		setRequestNodeValueByXPath("/Envelope/Body/getActorsByIdRequest/actor_id", actorId);
	}

}