package org.toyota_fabric.people;

import org.toyota_fabric.cars.Car;

import java.math.BigDecimal;

public class Cashier extends Man {

    private BigDecimal income = BigDecimal.ZERO;

    public Cashier(String name) {
        super(name);

    }

    public void addIncome(Car car) {
        if (car != null) {
            income = income.add(car.getPrice());
        }
    }

    public BigDecimal getIncome() {
        return income;
    }
}
