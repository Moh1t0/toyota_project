package org.toyota_fabric.car_components;

public class Roof {

    protected boolean idRaised = false;

    public void raised() {
        idRaised = true;
        System.out.println("Крыша поднята ");
    }

    public void lower() {
        idRaised = false;
        System.out.println("Крыша опущена ");
    }

    @Override
    public String toString() {
        return "Roof{" +
                "idRaised=" + idRaised +
                '}';
    }
}
