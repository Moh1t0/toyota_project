package org.toyota_fabric.warehouse;

import org.toyota_fabric.cars.Car;
import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.cars.trucks.Dyna;
import org.toyota_fabric.cars.trucks.Hiance;
import org.toyota_fabric.cars.сabriolet.Cabriolet;
import org.toyota_fabric.cars.сabriolet.Solara;
import org.toyota_fabric.enums.CarType;

import java.util.*;

public class Warehouse {
    private final static int MAX_CAPACITY = 1000;
    private int countCar = 0;

    Map<CarType, List<Car>> warehouseMap = new HashMap<>();

    public void addToWarehouse(Car car) {
        if (car == null) {
            throw new NullPointerException();
        }
        if (countCar < MAX_CAPACITY) {
            List<Car> carList = warehouseMap.get(car.getCarType());
            if (carList == null) {
                carList = new ArrayList<>() {
                };
            }
            if (carList.add(car)) {
                warehouseMap.put(car.getCarType(), carList);
                countCar++;
            }
        }
    }

    public Car takeCarFromWarehouse(Car car) {
        if (car == null) {
            throw new NullPointerException();
        }
        List<Car> carList = warehouseMap.get(car.getCarType());
        if (carList != null) {
            if (carList.remove(car)) {
                countCar--;
            }
        }
        return car;
    }

    public int carsCount(CarType carType) {
        List<Car> carList = warehouseMap.get(carType);
        int result = 0;
        if (carList != null) {
            result = carList.size();
        }
        System.out.printf("Автомобилей  %s на складе осталось - % d ", carType, result);
        return result;
    }

    public int getCountCar() {
        return countCar;
    }

    public Map<CarType, List<Car>> getWarehouseMap() {
        return warehouseMap;
    }
}
