package org.toyota_fabric.car_components;

public class LiftingPower {
    protected double power;

    public LiftingPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "LiftingPower{" +
                "power=" + power +
                '}';
    }
}
