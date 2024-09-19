package org.toyota_fabric.cars.trucks;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;

import java.math.BigDecimal;

public class Hiance extends Truck {
    private SpareWheel spareWheel;

    public Hiance(String color, int maxSpeed, boolean isMoving, Electrics electrics,
                  Engine engine, Headlights headlights, GearBoxType gearBoxType, Wheel rightFront,
                  Wheel leftFront, Wheel rightBack, Wheel leftBack, BigDecimal price, GasTank gasTank,
                  Country country, LiftingPower liftingPower, SpareWheel spareWheel) {
        super(color, maxSpeed, isMoving, electrics, engine, headlights, gearBoxType, rightFront,
                leftFront, rightBack, leftBack, price, gasTank, country, liftingPower);
        this.spareWheel = spareWheel;
    }

    public SpareWheel getSpareWheel() {
        return spareWheel;
    }
}
