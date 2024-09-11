package org.toyota_fabric.enums;

public enum WheelsDiameter {
    CAMRY(17),
    SOLARA(16),
    HIANCE(20),
    DYNA(20);

    private final int diameter;

    WheelsDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
