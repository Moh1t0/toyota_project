package org.toyota_fabric.people;

import org.toyota_fabric.cars.Car;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.factory.Conveyor;
import org.toyota_fabric.factory.Factory;
import org.toyota_fabric.warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Manager extends Man {
    private Conveyor conveyor;
    private Warehouse warehouse;

    public Manager(String name, Conveyor conveyor, Warehouse warehouse) {
        super(name);
        this.conveyor = conveyor;
        this.warehouse = warehouse;
    }

    public Car sellCar(Buyer buyer, Warehouse warehouse) {
        if (warehouse.getCountCar() > 0) {
            for (CarType carType : CarType.values()) {
                List<Car> carList = warehouse.getWarehouseMap().get(carType);
                if (carList != null && !carList.isEmpty()) {
                    carList.sort((car1, car2) -> car2.getPrice().compareTo(car1.getPrice()));
                    for (Car car : carList) {
                        if (buyer.getMoney().compareTo(car.getPrice()) >= 0) {
                            warehouse.takeCarFromWarehouse(car);
                            return car;
                        }
                    }
                }
            }
        }
        Car car = createNewCar(buyer);
        return car;
    }

    private Car createNewCar(Buyer buyer) {
        BigDecimal camryPrice = new BigDecimal("10000.00");
        BigDecimal solaraPrice = new BigDecimal("12000.00");
        BigDecimal hiancePrice = new BigDecimal("15000.00");
        BigDecimal dynaPrice = new BigDecimal("22000.00");

        BigDecimal tenPercentIncrease = new BigDecimal("0.10");

        if (buyer.getMoney().compareTo(camryPrice) >= 0) {
            BigDecimal newCamryPrice = camryPrice.multiply(tenPercentIncrease);
            Car Camry = conveyor.createCamry("black", newCamryPrice);
            warehouse.addToWarehouse(Camry);
            return Camry;
        } else if (buyer.getMoney().compareTo(solaraPrice) >= 0) {
            BigDecimal newSolaraPrice = solaraPrice.multiply(tenPercentIncrease);
            Car Solara = conveyor.createSolara(newSolaraPrice, "white");
            warehouse.addToWarehouse(Solara);
            return Solara;
        } else if (buyer.getMoney().compareTo(hiancePrice) >= 0) {
            BigDecimal newHiancePrice = hiancePrice.multiply(tenPercentIncrease);
            Car Hiance = conveyor.createHiance("black", newHiancePrice);
            warehouse.addToWarehouse(Hiance);
            return Hiance;
        } else if (buyer.getMoney().compareTo(dynaPrice) >= 0) {
            BigDecimal newDynaPrice = dynaPrice.multiply(tenPercentIncrease);
            Car Dyna = conveyor.createDyna("black", newDynaPrice);
            warehouse.addToWarehouse(Dyna);
            return Dyna;
        } else {
            return null;
        }
    }
}