package org.toyota_fabric.people;

import java.math.BigDecimal;

public class Buyer extends Man {
    private BigDecimal money;

    public Buyer(String name, BigDecimal money) {
        super(name);
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

}
