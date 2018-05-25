package com.trainingserver.operations;
public class DeleteActor extends OperationsTemplate {
	public DeleteActor() {
		this.setLink("deleteActor");
		this.setup();
	}

	public void setActorId(String actorId) {
		setRequestNodeValueByXPath("/Envelope/Body/deleteActorRequest/actor_id", actorId);
	}

}