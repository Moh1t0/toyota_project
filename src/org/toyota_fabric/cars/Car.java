package org.toyota_fabric.cars;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;
import org.toyota_fabric.exeptions.StartCarException;

import java.math.BigDecimal;

public abstract class Car {
    protected String color;
    protected int maxSpeed;
    protected boolean isMoving;
    protected Electrics electrics;
    protected Engine engine;
    protected Headlights headlights;
    protected GearBoxType gearBoxType;
    protected Wheel rightFront;
    protected Wheel leftFront;
    protected Wheel rightBack;
    protected Wheel leftBack;
    protected BigDecimal price;
    protected GasTank gasTank;
    protected Country country;
    protected Wheel wheel;
    protected CarType carType;

    public Car(String color, int maxSpeed, boolean isMoving, Electrics electrics, Engine engine, Headlights headlights,
               GearBoxType gearBoxType, Wheel rightFront, Wheel leftFront, Wheel rightBack, Wheel leftBack,
               BigDecimal price, GasTank gasTank, Country country, CarType carType) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMoving = isMoving;
        this.electrics = electrics;
        this.engine = engine;
        this.headlights = headlights;
        this.gearBoxType = gearBoxType;
        this.rightFront = rightFront;
        this.leftFront = leftFront;
        this.rightBack = rightBack;
        this.leftBack = leftBack;
        this.price = price;
        this.gasTank = gasTank;
        this.country = country;
        this.carType = carType;
    }

    public void startMove() throws StartCarException {
        if ((rightBack != null && !rightBack.isPierced()) &&
                (rightFront != null && !rightFront.isPierced()) &&
                (leftBack != null && !leftBack.isPierced()) &&
                (leftFront != null && !leftFront.isPierced()) &&
                gasTank.getFuel() > 0 &&
                (electrics.isWork() && engine.isWork())) {

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

    public GasTank getGasTank() {
        return gasTank;
    }

    public void setGasTank(GasTank gasTank) {
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

    public void setRightFront(Wheel rightFront) {
        this.rightFront = rightFront;
    }

    public void setLeftFront(Wheel leftFront) {
        this.leftFront = leftFront;
    }

    public void setRightBack(Wheel rightBack) {
        this.rightBack = rightBack;
    }

    public void setLeftBack(Wheel leftBack) {
        this.leftBack = leftBack;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public CarType getCarType() {
        return carType;
    }

    public BigDecimal getPrice() {
        return price;
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
