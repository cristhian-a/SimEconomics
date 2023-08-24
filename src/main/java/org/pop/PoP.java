package org.pop;

import org.market.Good;

import java.util.List;

public abstract class PoP {
    protected String location;
    protected Strata strata;
    protected int people;
    protected Profession profession;
    protected Trait trait;
    protected List<String> needs;
    protected List<String> wants;
    protected List<String> luxuries;
    protected float savings;
    protected List<Good> goods;

    public PoP() {
    }

    public PoP(String location, Strata strata, int people, Profession profession, Trait trait, List<String> needs, List<String> wants, List<String> luxuries, float savings, List<Good> goods) {
        this.location = location;
        this.strata = strata;
        this.people = people;
        this.profession = profession;
        this.trait = trait;
        this.needs = needs;
        this.wants = wants;
        this.luxuries = luxuries;
        this.savings = savings;
        this.goods = goods;
    }

    public abstract void work();
    public abstract boolean buyNeeds();
    public abstract boolean buyWants();
    public abstract boolean buyLuxuries();
    public abstract boolean consumeDailyGoods();
}
