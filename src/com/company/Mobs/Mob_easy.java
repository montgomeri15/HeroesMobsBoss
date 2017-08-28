package com.company.Mobs;

import com.company.All;
import com.company.Inter;

public class Mob_easy extends All implements Inter, Mobs_inter {
    public Mob_easy(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String ataka() {
        return "Медленная";
    }

    @Override
    public int zashita() {
        return 0;
    }

    @Override
    public String peredwizhenie() {
        return "Медленная";
    }

    @Override
    public String uroven() {
        return "Лёгкий";
    }
}
