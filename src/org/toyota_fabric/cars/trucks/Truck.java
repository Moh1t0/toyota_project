package org.toyota_fabric.cars.trucks;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.cars.Car;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;

import java.math.BigDecimal;

public abstract class Truck extends Car {
    private LiftingPower liftingPower;

    public Truck(String color, int maxSpeed, boolean isMoving, Electrics electrics, Engine engine,
                 Headlights headlights, GearBoxType gearBoxType, Wheel rightFront, Wheel leftFront, Wheel rightBack,
                 Wheel leftBack, BigDecimal price, GasTank gasTank, Country country, LiftingPower liftingPower) {
        super(color, maxSpeed, isMoving, electrics, engine, headlights, gearBoxType, rightFront, leftFront,
                rightBack, leftBack, price, gasTank, country);
        this.liftingPower = liftingPower;
    }

    public LiftingPower getLiftingPower() {
        return liftingPower;
    }
}
