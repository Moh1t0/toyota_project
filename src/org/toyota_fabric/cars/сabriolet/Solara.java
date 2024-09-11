package org.toyota_fabric.cars.сabriolet;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;

public class Solara extends Cabriolet {

    public Solara(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics,
                  Engine engine, Headlights headlights, GearBoxType gearBoxType, Wheels rightFront,
                  Wheels leftFront, Wheels rightBack, Wheels leftBack, double price, boolean cruiseControl,
                  boolean isRoofDown) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType,
                rightFront, leftFront, rightBack, leftBack, price, cruiseControl, isRoofDown);
    }

    public void coolDrink() {
        System.out.println("Напиток охлажден");
    }
}
