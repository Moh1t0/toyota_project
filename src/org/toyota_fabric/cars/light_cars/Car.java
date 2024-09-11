package org.toyota_fabric.cars.light_cars;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.enums.GearBoxType;
import org.toyota_fabric.exeptions.StartCarException;

import java.util.Arrays;

public abstract class Car {
    protected String color;
    protected int maxSpeed;
    protected boolean isMoving;
    protected int gasTank;
    protected Electrics electrics;
    protected Engine engine;
    protected Headlights headlights;
    protected GearBoxType gearBoxType;
    protected Wheels rightFront;
    protected Wheels leftFront;
    protected Wheels rightBack;
    protected Wheels leftBack;
    protected double price;

    public Car(String color, int maxSpeed, boolean isMoving, int gasTank, Electrics electrics,
               Engine engine, Headlights headlights, GearBoxType gearBoxType, Wheels rightFront, Wheels leftFront,
               Wheels rightBack, Wheels leftBack, double price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMoving = isMoving;
        this.gasTank = gasTank;
        this.electrics = electrics;
        this.engine = engine;
        this.headlights = headlights;
        this.gearBoxType = gearBoxType;
        this.rightFront = rightFront;
        this.leftFront = leftFront;
        this.rightBack = rightBack;
        this.leftBack = leftBack;
        this.price = price;
    }

    public void startMove() throws StartCarException {
        if ((!rightBack.isPierced() && !rightFront.isPierced() && !leftBack.isPierced() && !leftFront.isPierced())
                && gasTank > 0 && (electrics.isWork() && engine.isWork())) {
            this.isMoving = true;
            System.out.println("Машина едет");
        } else {
            throw new StartCarException("Движение невозможно");
        }
    }

    public void finishMove() {
        this.isMoving = false;
        System.out.println("Машина остановлена");
    }


    public void turningOnHeadlights() {
        this.headlights.setWork(true);
        System.out.println("Фары работают");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }

    public void setElectrics(Electrics electrics) {
        this.electrics = electrics;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setHeadlights(Headlights headlights) {
        this.headlights = headlights;
    }

    public void setGearBoxType(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public void setRightFront(Wheels rightFront) {
        this.rightFront = rightFront;
    }

    public void setLeftFront(Wheels leftFront) {
        this.leftFront = leftFront;
    }

    public void setRightBack(Wheels rightBack) {
        this.rightBack = rightBack;
    }

    public void setLeftBack(Wheels leftBack) {
        this.leftBack = leftBack;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isMoving=" + isMoving +
                ", gasTank=" + gasTank +
                ", electrics=" + electrics +
                ", engine=" + engine +
                ", headlights=" + headlights +
                ", gearBoxType=" + gearBoxType +
                ", rightFront=" + rightFront +
                ", leftFront=" + leftFront +
                ", rightBack=" + rightBack +
                ", leftBack=" + leftBack +
                ", price=" + price +
                '}';
    }
}
