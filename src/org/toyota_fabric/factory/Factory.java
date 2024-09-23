package org.toyota_fabric.factory;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.WheelsDiameter;
import org.toyota_fabric.exeptions.CountyFactoryNotEqualException;

public class Factory {
    private Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Engine createEngine() {
        return new Engine(true);
    }

    public Electrics createElectrics() {
        return new Electrics(true);
    }

    public Wheel createWheel(WheelsDiameter wheelsDiameter) {
        return new Wheel(false, wheelsDiameter);
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public Headlights createHeadLights() {
        return new Headlights(false);
    }

    public Roof createRoof() {
        return new Roof();
    }

    public Usb createUsb() {
        return new Usb();
    }

    public CruiseControl createCruiseControl() {
        return new CruiseControl();
    }

    public LiftingPower createLiftingPower() {
        return new LiftingPower(3000);
    }

    public Socket createSocket() {
        return new Socket();
    }

    public SpareWheel createSpareWheel() {
        return new SpareWheel(false);
    }

    public Refrigerator createRefrigerator() {
        return new Refrigerator();
    }
}
