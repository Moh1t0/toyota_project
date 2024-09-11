package org.toyota_fabric.cars.light_cars;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;

public class Camry extends LightCar {

    public Camry(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics, Engine engine,
                 Headlights headlights, GearBoxType gearBoxType, Wheels rightFront, Wheels leftFront, Wheels rightBack,
                 Wheels leftBack, double price, boolean cruiseControl) {
        super(color, maxSpeed, isMoving, gasTank, electrics, engine, headlights, gearBoxType, rightFront, leftFront,
                rightBack, leftBack, price, cruiseControl);
    }

    public void usb() {
        System.out.println("Музыка подключена");
    }


}
