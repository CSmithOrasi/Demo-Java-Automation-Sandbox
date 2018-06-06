package com.trainingserver.rest.unittests;

import org.testng.annotations.Test;

import com.orasi.utils.TestReporter;
import com.trainingserver.rest.actors.objects.Actor;
import com.trainingserver.rest.films.objects.Film;

public class TestFilm {
    @Test
    public void equalsReturnsTrueForEmptyObjects() {
        Film filmA = new Film();
        Film filmB = new Film();

        TestReporter.assertTrue(filmA.equals(filmB), "empty film == empty film");
    }

    @Test
    public void equalsReturnsTrueWhenFieldsMatch() {
        Film filmA = new Film();
        Film filmB = new Film();

        filmA.setFilmId(20);
        filmA.setDescription("A film.");
        filmA.setActors(new Actor[0]);

        filmB.setFilmId(20);
        filmB.setDescription("A film.");
        filmB.setActors(new Actor[0]);

        TestReporter.assertTrue(filmA.equals(filmB), "returns true for Film objects w identical field values");
    }

    @Test
    public void equalsFalseWhenDifferentActors() {
        Film filmA = new Film();
        Film filmB = new Film();

        Actor actorA = new Actor();
        actorA.setActorId(0);

        Actor actorB = new Actor();
        actorB.setActorId(1);

        Actor[] actorsA = { actorA };
        Actor[] actorsB = { actorB };

        filmA.setActors(actorsA);
        filmB.setActors(actorsB);

        TestReporter.assertFalse(filmA.equals(filmB), "returns false for Film objects w equal-length actor arrays but different values");
    }

}
