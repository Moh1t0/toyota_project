package org.toyota_fabric.car_components;

public abstract class Detail {
    protected boolean isWork;

    public Detail(boolean isWork) {
        this.isWork = isWork;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
