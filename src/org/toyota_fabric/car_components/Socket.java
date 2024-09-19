package org.toyota_fabric.car_components;

/**
 *Розетка для Dyna
 */

public class Socket {
    protected boolean hasWork = false;

    public void charge() {
        hasWork = true;
        System.out.println("Телефон заряжается ");
    }

    public void disable() {
        hasWork = false;
        System.out.println("Зарядка отключена");
    }

    @Override
    public String toString() {
        return "Socket{" +
                "hasWork=" + hasWork +
                '}';
    }
}
