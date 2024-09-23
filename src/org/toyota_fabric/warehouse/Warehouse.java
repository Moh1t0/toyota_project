package org.toyota_fabric.warehouse;

import org.toyota_fabric.cars.Car;
import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.cars.trucks.Dyna;
import org.toyota_fabric.cars.trucks.Hiance;
import org.toyota_fabric.cars.сabriolet.Cabriolet;
import org.toyota_fabric.cars.сabriolet.Solara;
import org.toyota_fabric.enums.CarType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private final static int MAX_CAPACITY = 1000;
    private int countCar = 0;

    List<Camry> camryList = new ArrayList<>();
    List<Solara> solaraList = new ArrayList<>();
    List<Dyna> dynaList = new ArrayList<>();
    List<Hiance> hianceList = new ArrayList<>();

    HashMap<CarType, List<Car>> map = new HashMap<>();
    List<Car> carList = new ArrayList<>();

    public void addToMap(Car car) {
        if (countCar < MAX_CAPACITY) {
            if (car.getCarType() == CarType.CAMRY) {
                camryList.add((Camry) car);
                countCar++;
            } else if (car.getCarType() == CarType.SOLARA) {
                solaraList.add((Solara) car);
                countCar++;
            } else if (car.getCarType() == CarType.DYNA) {
                dynaList.add((Dyna) car);
                countCar++;
            } else if (car.getCarType() == CarType.HIANCE) {
                hianceList.add((Hiance) car);
                countCar++;
            }
        }
    }

    //            carList.add(car);
//            map.put(car.getCarType(), carList)


    public Car takeFromMap(Car car) {
        if (countCar > MAX_CAPACITY) {
//            map.get(car.getCarType());
//            carList.remove(0);
//
            if (car.getCarType() == CarType.CAMRY) {
                for (int i = 0; i < carList.size(); i++) {
                    ((Camry) car).equals(camryList.get(i));
                    camryList.get(i).equals((Camry) car);
                }
            }
//                camryList.stream().filter(car1 -> car1.equals(car)).findFirst().get();
                countCar++;
            } else if (car.getCarType() == CarType.SOLARA) {
                solaraList.add((Solara) car);
                countCar++;
            } else if (car.getCarType() == CarType.DYNA) {
                dynaList.add((Dyna) car);
                countCar++;
            } else if (car.getCarType() == CarType.HIANCE) {
                hianceList.add((Hiance) car);
                countCar++;

        }
    }

    public void addCamry(Camry camry) {
        if (countCar < MAX_CAPACITY) {
            camryList.add(camry);
            countCar++;
        }
    }

    public void addSolara(Solara solara) {
        if (countCar < MAX_CAPACITY) {
            solaraList.add(solara);
            countCar++;
        }
    }

    public void addDyna(Dyna dyna) {
        if (countCar < MAX_CAPACITY) {
            dynaList.add(dyna);
            countCar++;
        }
    }

    public void addHiance(Hiance hiance) {
        if (countCar < MAX_CAPACITY) {
            hianceList.add(hiance);
            countCar++;
        }
    }

    public Camry takeCamry(Camry camry) {
        if (!camryList.isEmpty()) {
            countCar--;
        }
        return camryList.remove(0);
    }

    public Solara takeCSolara(Solara solara) {
        if (!solaraList.isEmpty()) {
            countCar--;
        }
        return solaraList.remove(0);
    }

    public Dyna takeDyna(Dyna dyna) {
        if (!dynaList.isEmpty()) {
            countCar--;
        }
        return dynaList.remove(0);
    }

    public Hiance takeHiance(Hiance hiance) {
        if (!hianceList.isEmpty()) {
            countCar--;
        }
        return hianceList.remove(0);
    }

    public int getCountCar() {
        return countCar;
    }

    public void camryCountCar() {
        System.out.println("Количество Camry на складе: " + camryList.size());
    }

    public void solaraCountCar() {
        System.out.println("Количество Solara на складе: " + solaraList.size());
    }

    public void dynaCountCar() {
        System.out.println("Количество Dyna на складе: " + dynaList.size());
    }

    public void hianceCountcar() {
        System.out.println("Количество Hiance на складе: " + hianceList.size());
    }

}
