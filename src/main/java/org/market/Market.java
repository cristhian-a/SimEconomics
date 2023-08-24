package org.market;

import org.pop.PoP;

import java.util.List;

public class Market {
    private String name;
    private List<PoP> pops;
    private List<Order> salesOrders;
    private List<Order> buyOrders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PoP> getPops() {
        return pops;
    }

    public void setPops(List<PoP> pops) {
        this.pops = pops;
    }

    public List<Order> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<Order> salesOrders) {
        this.salesOrders = salesOrders;
    }

    public List<Order> getBuyOrders() {
        return buyOrders;
    }

    public void setBuyOrders(List<Order> buyOrders) {
        this.buyOrders = buyOrders;
    }
}
