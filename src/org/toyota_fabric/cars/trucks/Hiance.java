package org.toyota_fabric.cars.trucks;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;

public class Hiance extends Truck {
    private boolean hasSpareWheel;

    public Hiance(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics, Engine engine,
                  Headlights headlights, GearBoxType gearBoxType, Wheels rightFront, Wheels leftFront, Wheels rightBack,
                  Wheels leftBack, double price, double liftingPower, boolean hasSpareWheel) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType, rightFront, leftFront,
                rightBack, leftBack, price, liftingPower);
        this.hasSpareWheel = hasSpareWheel;
    }

    public boolean isHasSpareWheel() {
        return hasSpareWheel;
    }

    public void setHasSpareWheel(boolean hasSpareWheel) {
        this.hasSpareWheel = hasSpareWheel;
    }
}
