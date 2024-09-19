package org.toyota_fabric.car_components;

import org.toyota_fabric.enums.WheelsDiameter;

public class Wheel {
    private boolean isPierced;
    private WheelsDiameter wheelsDiameter;

    public Wheel(boolean isPierced, WheelsDiameter wheelsDiameter) {
        this.isPierced = isPierced;
        this.wheelsDiameter = wheelsDiameter;
    }

    public boolean replaceWheels(Wheel oldWheel, Wheel newWheel) {
        if (oldWheel.wheelsDiameter == newWheel.wheelsDiameter) {
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
