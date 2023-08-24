package org.main;

import org.market.Market;
import org.market.Order;
import org.pop.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<PoP> mesoterranians = new ArrayList();
        mesoterranians.add(buildPeasant());

        Market mesoterraMarket = new Market();
        mesoterraMarket.setName("Mesoterranian Market");
        mesoterraMarket.setPops(mesoterranians);

        // executing PoPs' daily tasks
        for (int i = 0; i < 10; i++) {
            mesoterraMarket.getPops().forEach(x -> {
                x.work();
                x.consumeDailyGoods();
                if (x.buyNeeds()) {
                    Order buyOrder = new Order() {
                    };
                }
            });
        }

        System.out.println("Dê Enter para finalizar!");
        Scanner in = new Scanner(System.in);
//        in.nextLine();
    }

    private static PoP buildPeasant() {
        List<String> needs = new ArrayList();
        needs.add("Grain");
        List<String> wants = new ArrayList();
        List<String> luxuries = new ArrayList();
        return new Peasant(
                "Mesoterra",
                Strata.LOW,
                100,
                Profession.PEASANT,
                Trait.HEDONIST,
                needs,
                wants,
                luxuries,
                0,
                new ArrayList()
        );

    }
}