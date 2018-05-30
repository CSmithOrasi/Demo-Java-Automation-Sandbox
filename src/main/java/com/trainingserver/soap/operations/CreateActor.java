package com.trainingserver.soap.operations;
public class CreateActor extends OperationsTemplate {
	public CreateActor() {
		this.setLink("createActor");
		this.setup();
	}

	public void setFirstName(String firstName) {
		setRequestNodeValueByXPath("/Envelope/Body/createActorRequest/first_name", firstName);
	}

	public void setLastName(String lastName) {
		setRequestNodeValueByXPath("/Envelope/Body/createActorRequest/last_name", lastName);
	}

}