package org.toyota_fabric.car_components;

/**
 * Сменное колесо для Hiance
 */

public class SpareWheel {
    protected boolean hasWheel;

    public SpareWheel(boolean hasWheel) {
        this.hasWheel = hasWheel;
    }

    @Override
    public String toString() {
        return "SpareWheel{" +
                "hasWheel=" + hasWheel +
                '}';
    }
}
