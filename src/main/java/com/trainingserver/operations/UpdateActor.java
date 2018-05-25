package com.trainingserver.operations;
public class UpdateActor extends OperationsTemplate {
	public UpdateActor() {
		this.setLink("updateActor");
		this.setup();
	}

	public void setActorId(String actorId) {
		setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/actor_id", actorId);
	}

	public void setNewFirst_Name(String newFirst_name) {
		setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/new_first_name", newFirst_name);
	}

	public void setNewLast_Name(String newLast_name) {
		setRequestNodeValueByXPath("/Envelope/Body/updateActorRequest/new_last_name", newLast_name);
	}

}