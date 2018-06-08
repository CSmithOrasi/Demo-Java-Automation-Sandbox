package com.trainingserver.rest.unittests;

import org.testng.annotations.Test;

import com.orasi.utils.TestReporter;
import com.trainingserver.rest.actors.objects.Actor;

public class TestActor {
    @Test
    public void equalsTrueWhenAllFieldValuesIdentical() {
        Actor actorA = new Actor();
        actorA.setActorId(1);
        actorA.setLastName("NEM");
        Actor actorB = new Actor();
        actorB.setActorId(1);
        actorB.setLastName("NEM");

        TestReporter.assertTrue(actorA.equals(actorB), "Actors with identical fields return true");
    }

    @Test
    public void equalsFalseWhenValueMismatch() {
        Actor actorA = new Actor();
        actorA.setActorId(0);
        Actor actorB = new Actor();
        actorB.setActorId(1);

        TestReporter.assertFalse(actorA.equals(actorB), "Actors with mismatched fields return false");
    }
}
