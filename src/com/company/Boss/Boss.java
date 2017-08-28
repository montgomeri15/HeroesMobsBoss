package com.company.Boss;

import com.company.All;
import com.company.Inter;

public class Boss extends All implements Inter, Boss_inter {
    public Boss(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String name() {
        return "Анубарак";
    }

    @Override
    public int kolichestwo_zakl() {
        return 5;
    }

    @Override
    public String ataka() {
        return "Быстрая";
    }

    @Override
    public int zashita() {
        return 60;
    }

    @Override
    public String peredwizhenie() {
        return "Быстрая";
    }
}
