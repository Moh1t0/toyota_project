package org.toyota_fabric.factory;

import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.cars.trucks.Dyna;
import org.toyota_fabric.cars.trucks.Hiance;
import org.toyota_fabric.cars.сabriolet.Solara;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;
import org.toyota_fabric.enums.WheelsDiameter;
import org.toyota_fabric.exeptions.CountyFactoryNotEqualException;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Objects;

public class Conveyor {
    private final Factory factory;
    private final Country country;

    public Conveyor(Country country, Factory factory) throws  CountyFactoryNotEqualException {
        this.country = country;
        if (!factory.getCountry().equals(country)) {
            throw new CountyFactoryNotEqualException("Страны не совпадают" + factory.getCountry() + " != " + country);
        }
        this.factory = factory;
    }

    public Camry createCamry(String color, BigDecimal price) {
        return new Camry(color, 160, false, factory.createElectrics(), factory.createEngine(),
                factory.createHeadLights(), GearBoxType.AUTOMATIC, factory.createWheel(WheelsDiameter.DIAMETER_17),
                factory.createWheel(WheelsDiameter.DIAMETER_17),
                factory.createWheel(WheelsDiameter.DIAMETER_17), factory.createWheel(WheelsDiameter.DIAMETER_17), price,
                factory.createGasTank(), country, CarType.CAMRY, factory.createCruiseControl(), factory.createUsb());
    }

    public Solara createSolara(BigDecimal price, String color) {
        return new Solara(color, 180, false, factory.createElectrics(), factory.createEngine(),
                factory.createHeadLights(), GearBoxType.AUTOMATIC, factory.createWheel(WheelsDiameter.DIAMETER_17),
                factory.createWheel(WheelsDiameter.DIAMETER_17),
                factory.createWheel(WheelsDiameter.DIAMETER_17), factory.createWheel(WheelsDiameter.DIAMETER_17), price,
                factory.createGasTank(), country, CarType.SOLARA, factory.createCruiseControl(),
                factory.createRoof(), factory.createRefrigerator());
    }

    public Dyna createDyna(String color, BigDecimal price) {
        return new Dyna(color, 130, false, factory.createElectrics(), factory.createEngine(),
                factory.createHeadLights(), GearBoxType.MECHANICS, factory.createWheel(WheelsDiameter.DIAMETER_20),
                factory.createWheel(WheelsDiameter.DIAMETER_20),
                factory.createWheel(WheelsDiameter.DIAMETER_20), factory.createWheel(WheelsDiameter.DIAMETER_20), price,
                factory.createGasTank(), country, CarType.DYNA ,factory.createLiftingPower(), factory.createSocket());
    }

    public Hiance createHiance(String color, BigDecimal price) {
        return new Hiance(color, 120, false, factory.createElectrics(), factory.createEngine(),
                factory.createHeadLights(), GearBoxType.MECHANICS, factory.createWheel(WheelsDiameter.DIAMETER_20),
                factory.createWheel(WheelsDiameter.DIAMETER_16),
                factory.createWheel(WheelsDiameter.DIAMETER_20), factory.createWheel(WheelsDiameter.DIAMETER_20), price,
                factory.createGasTank(), country, CarType.HIANCE, factory.createLiftingPower(), factory.createSpareWheel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conveyor conveyor = (Conveyor) o;
        return Objects.equals(factory, conveyor.factory) && country == conveyor.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factory, country);
    }
}
