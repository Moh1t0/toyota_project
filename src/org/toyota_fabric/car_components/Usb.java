package org.toyota_fabric.car_components;

public class Usb {
    protected boolean isWork = false;

    public void musicOn() {
        System.out.println("Музыка подключена");
    }

    public void musicOff() {
        System.out.println("Музыка выключена ");
    }

    @Override
    public String toString() {
        return "Usb{" +
                "isWork=" + isWork +
                '}';
    }
}
