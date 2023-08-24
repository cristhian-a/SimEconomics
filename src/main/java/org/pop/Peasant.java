package org.pop;

import org.market.Good;
import org.market.Market;
import org.market.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Peasant extends PoP {

    public Peasant(String location, Strata strata, int people, Profession profession, Trait trait, List<String> needs, List<String> wants, List<String> luxuries, float savings, List<Good> goods) {
        super(location, strata, people, profession, trait, needs, wants, luxuries, savings, goods);
    }

    @Override
    public void work() {
        // producing grains
        Good grain = new Good();
        grain.setName("Grain");
        grain.setQuantity(10 * this.people);
        grain.setProductionCost(0f);

        // adding work production to goods stock
        var grains = goods.stream().filter(x -> x.getName().equals("Grain")).collect(Collectors.toList());
        if (grains.isEmpty())
            goods.add(grain);
        else
            grains.get(0).setQuantity(grains.get(0).getQuantity() + grain.getQuantity());
    }

    @Override
    public boolean buyNeeds() {
        return false;
    }

    @Override
    public boolean buyWants() {
        return false;
    }

    @Override
    public boolean buyLuxuries() {
        return false;
    }

    @Override
    public boolean consumeDailyGoods() {
        Good grain = goods.stream().filter(x -> x.getName().equals("Grain")).findFirst().get();
        int grainQtd = grain.getQuantity();
        int resultingGrainQtd = grainQtd - 8 * this.people;
        if (resultingGrainQtd < 0) {
            grain.setQuantity(0);
            return false;
        } else {
            grain.setQuantity(resultingGrainQtd);
            return true;
        }
    }
}
