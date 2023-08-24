package org.market;

import java.util.List;

public class Good {
    private String name;
    private List<String> requiredMaterials;
    private float productionCost;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRequiredMaterials() {
        return requiredMaterials;
    }

    public void setRequiredMaterials(List<String> requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public float getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
