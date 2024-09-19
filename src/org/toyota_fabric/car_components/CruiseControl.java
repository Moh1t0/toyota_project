package org.toyota_fabric.car_components;

public class CruiseControl {

    protected boolean isWork = false;

    public void on() {
        isWork = true;
        System.out.println("Круиз контроль включен");
    }

    public void off() {
        isWork = false;
        System.out.println("Круиз контроль выключен");
    }

    @Override
    public String toString() {
        return "CruiseControl{" +
                "isWork=" + isWork +
                '}';
    }
}
