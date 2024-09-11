package org.toyota_fabric.car_components;

import org.toyota_fabric.enums.WheelsDiameter;

public class Wheels {
    private boolean isPierced;
    private WheelsDiameter wheelsDiameter;

    public Wheels(boolean isPierced, WheelsDiameter wheelsDiameter) {
        this.isPierced = isPierced;
        this.wheelsDiameter = wheelsDiameter;
    }

    public boolean replaceWheels(Wheels oldWheels, Wheels newWheels) {
        if (oldWheels.wheelsDiameter.getDiameter() == newWheels.wheelsDiameter.getDiameter()) {
            System.out.println("Колеса заменены");
            return true;
        }
        System.out.println("Ошибка, диаметры колёс не совпадают");
        return false;
    }

    public boolean isPierced() {
        return isPierced;
    }

    public void setPierced(boolean pierced) {
        isPierced = pierced;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "isPierced=" + isPierced +
                ", wheelsDiameter=" + wheelsDiameter +
                '}';
    }
}
