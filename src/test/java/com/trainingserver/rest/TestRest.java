package com.trainingserver.rest;

import org.testng.annotations.Test;

import com.orasi.api.restServices.RestResponse;
import com.orasi.utils.TestReporter;
import com.trainingserver.rest.actors.objects.ActorListing;

public class TestRest {
    ActorListing actor;

    // Turns on logging to console:
    // @BeforeClass
    // public void activateLogging() {
    // TestReporter.setDebugLevel(TestReporter.TRACE);
    // TestReporter.setPrintToConsole(true);
    // }

    @Test
    public void testGetAllActors() {
        RestResponse response = TrainingServerRest.actors().getAllActors();

        ActorListing[] list = response.mapJSONToObject(ActorListing[].class);

        // ALTERNATIVE:
        // Gson gson = new Gson();
        // gson.fromJson(response.getResponse(), new TypeToken<ArrayList<ActorListing>>() {}.getType());

        for (ActorListing actor : list) {
            TestReporter.assertTrue(actor.getFirstName().matches("[A-Za-z?]+"), "Validating firstName format: " + actor.getFirstName());
            TestReporter.assertTrue(actor.getFirstName().matches("[A-Za-z?]+"), "Validating lastName format: " + actor.getLastName());
        }
    }

    @Test
    public void testGetActorsByFirstName() {
        String firstName = "tom";
        ActorListing actor = new ActorListing();
        actor.setFirstName(firstName);
        RestResponse response = TrainingServerRest.actors().getActorsByFirstName(actor);
        ActorListing[] actors = response.mapJSONToObject(ActorListing[].class);

        for (ActorListing currentActor : actors) {
            TestReporter.assertTrue(currentActor.getFirstName().toLowerCase().equals(firstName),
                    "Validating firstName for: " + currentActor.getFirstName() + " " + currentActor.getLastName());
        }
    }

    @Test
    public void testCreateActor() {
        String firstName = "FAKE";
        String lastName = "ACTOR";

        actor = new ActorListing();
        actor.setFirstName(firstName);
        actor.setLastName(lastName);

        RestResponse response = TrainingServerRest.actors().createActor(actor);
        actor = response.mapJSONToObject(ActorListing.class);

        TestReporter.assertEquals(actor.getFirstName(), firstName, "Validate created actor first name: " + actor.getFirstName());
        TestReporter.assertEquals(actor.getLastName(), lastName, "Validate created actor last name: " + actor.getLastName());
    }

    @Test(dependsOnMethods = "testCreateActor")
    public void testUpdateActor() {
        String firstName = "FORK";
        String lastName = "ORCTOR";

        actor.setFirstName(firstName);
        actor.setLastName(lastName);

        RestResponse response = TrainingServerRest.actors().updateActor(actor);
        actor = response.mapJSONToObject(ActorListing.class);

        TestReporter.assertEquals(actor.getFirstName(), firstName, "Validate updated actor first name: " + actor.getFirstName());
        TestReporter.assertEquals(actor.getLastName(), lastName, "Validate updated actor last name: " + actor.getLastName());
    }

    @Test(dependsOnMethods = "testUpdateActor")
    public void testDeleteActor() {
        RestResponse response = TrainingServerRest.actors().deleteActor(actor);

        TestReporter.assertEquals("Actor [" + actor.getActorId() + "] was deleted successfully.", response.getResponse(), "Validate delete actor response");
    }
}