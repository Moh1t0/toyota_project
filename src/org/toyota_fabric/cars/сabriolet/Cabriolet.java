package org.toyota_fabric.cars.сabriolet;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.cars.light_cars.Car;
import org.toyota_fabric.cars.light_cars.LightCar;
import org.toyota_fabric.enums.GearBoxType;

public abstract class Cabriolet extends LightCar {
    private boolean isRoofDown;

    public Cabriolet(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics,
                     Engine engine, Headlights headlights, GearBoxType gearBoxType, Wheels rightFront,
                     Wheels leftFront, Wheels rightBack, Wheels leftBack, double price, boolean
                             cruiseControl, boolean isRoofDown) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType, rightFront,
                leftFront, rightBack, leftBack, price, cruiseControl);
        this.isRoofDown = isRoofDown;
    }

    public boolean isRoofDown() {
        return isRoofDown;
    }

    public void setRoofDown(boolean roofDown) {
        isRoofDown = roofDown;
    }
}
