package com.trainingserver.rest.actors.objects;

import java.lang.reflect.Field;

public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Actor actor;

        if (!(obj instanceof Actor)) {
            return false;
        } else {
            actor = (Actor) obj;
        }

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            try {
                if (field.get(actor) != null && field.get(this) != null) {
                    if (!field.get(this).equals(field.get(actor))) {
                        return false;
                    }
                } else if (field.get(actor) == null && field.get(this) == null) {
                    continue;
                } else if (field.get(actor) == null || field.get(this) == null) {
                    return false;
                }
            } catch (IllegalArgumentException | IllegalAccessException e) {
                return false;
            }
        }

        return true;
    }
}
