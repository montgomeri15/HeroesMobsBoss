package com.company.Heroes;

import com.company.All;
import com.company.Inter;

public class Lortemar extends All implements Inter, Heroes_inter {
    public Lortemar(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String name() {
        return "Лортемар Терон";
    }

    @Override
    public int mana() {
        return 20;
    }

    @Override
    public int kolichestwo_zakl() {
        return 9;
    }

    @Override
    public int lvl() {
        return 109;
    }

    @Override
    public String ataka() {
        return "Быстрая";
    }

    @Override
    public int zashita() {
        return 213;
    }

    @Override
    public String peredwizhenie() {
        return "Быстрая";
    }
}
