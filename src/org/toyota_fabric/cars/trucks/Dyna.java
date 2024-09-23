package org.toyota_fabric.cars.trucks;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;

import java.math.BigDecimal;

public class Dyna extends Truck {
    private Socket socket;

    public Dyna(String color, int maxSpeed, boolean isMoving, Electrics electrics, Engine engine,
                Headlights headlights, GearBoxType gearBoxType, Wheel rightFront, Wheel leftFront, Wheel rightBack,
                Wheel leftBack, BigDecimal price, GasTank gasTank, Country country, CarType carType,
                LiftingPower liftingPower, Socket socket) {
        super(color, maxSpeed, isMoving, electrics, engine, headlights, gearBoxType, rightFront, leftFront,
                rightBack, leftBack, price, gasTank, country, carType, liftingPower);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}

