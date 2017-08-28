package com.company.Mobs;

import com.company.All;
import com.company.Inter;

public class Mob_middle extends All implements Inter, Mobs_inter {
    public Mob_middle(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String ataka() {
        return "Средняя";
    }

    @Override
    public int zashita() {
        return 0;
    }

    @Override
    public String peredwizhenie() {
        return "Средне-быстрая";
    }

    @Override
    public String uroven() {
        return "Средний";
    }
}
