package org.toyota_fabric.cars.trucks;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;

public class Dyna extends Truck {
    public Dyna(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics, Engine engine,
                Headlights headlights, GearBoxType gearBoxType, Wheels rightFront, Wheels leftFront, Wheels rightBack,
                Wheels leftBack, double price, double liftingPower) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType, rightFront, leftFront,
                rightBack, leftBack, price, liftingPower);
    }

    public void charge() {
        System.out.println("Телефон заряжается");
    }
}
