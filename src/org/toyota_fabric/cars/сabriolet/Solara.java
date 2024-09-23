package org.toyota_fabric.cars.сabriolet;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;

import java.math.BigDecimal;

public class Solara extends Cabriolet {

    protected Refrigerator refrigerator;

    public Solara(String color, int maxSpeed, boolean isMoving, Electrics electrics, Engine engine,
                  Headlights headlights, GearBoxType gearBoxType, Wheel rightFront, Wheel leftFront, Wheel rightBack,
                  Wheel leftBack, BigDecimal price, GasTank gasTank, Country country, CarType carType,
                  CruiseControl cruiseControl, Roof roof, Refrigerator refrigerator) {
        super(color, maxSpeed, isMoving, electrics, engine, headlights, gearBoxType, rightFront,
                leftFront, rightBack, leftBack, price, gasTank, country, carType, cruiseControl, roof);
        this.refrigerator = refrigerator;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}
