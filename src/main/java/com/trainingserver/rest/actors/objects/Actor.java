package com.trainingserver.rest.actors.objects;

import com.trainingserver.rest.objects.RestObject;

public class Actor extends RestObject {
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

    // @Override
    // public boolean equals(Object obj) {
    // Actor actor;
    //
    // if (!(obj instanceof Actor)) {
    // return false;
    // } else {
    // actor = (Actor) obj;
    // }
    //
    // Field[] fields = this.getClass().getDeclaredFields();
    //
    // for (Field field : fields) {
    // try {
    // if (field.get(actor) != null && field.get(this) != null) {
    // if (!field.get(this).equals(field.get(actor))) {
    // return false;
    // }
    // } else if (field.get(actor) == null && field.get(this) == null) {
    // continue;
    // } else if (field.get(actor) == null || field.get(this) == null) {
    // return false;
    // }
    // } catch (IllegalArgumentException | IllegalAccessException e) {
    // return false;
    // }
    // }
    //
    // return true;
    // }
    //
    // public boolean altequals(Object obj) {
    // if (!(obj instanceof Actor) || obj == null) {
    // return false;
    // }
    // Actor actor = (Actor) obj;
    //
    // Method[] methods = this.getClass().getMethods();
    //
    // for (Method method : methods) {
    // if (method.getName().contains("get")) {
    // try {
    // System.out.print(method.getName() + ":\t");
    // System.out.println(method.invoke(this));
    // System.out.print(method.getName() + ":\t");
    // System.out.println(method.invoke(actor));
    // if (!method.invoke(this).equals(method.invoke(actor))) {
    // return false;
    // }
    // } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }
    // }
    // return true;
    // }
}
