package org.toyota_fabric.cars.light_cars;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;

public abstract class LightCar extends Car {
    private boolean cruiseControl;

    public LightCar(String color, int maxSpeed, boolean isMoving, int gasTank,
                    Electrics electrics, Engine engine, Headlights headlights, GearBoxType gearBoxType,
                    Wheels rightFront, Wheels leftFront, Wheels rightBack, Wheels
                            leftBack, double price, boolean cruiseControl) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType,
                rightFront, leftFront, rightBack, leftBack, price);
        this.cruiseControl = cruiseControl;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "LightCar{" +
                "cruiseControl=" + cruiseControl +
                '}';
    }
}
