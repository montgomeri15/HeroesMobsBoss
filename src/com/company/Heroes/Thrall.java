package com.company.Heroes;

import com.company.All;
import com.company.Inter;

public class Thrall extends All implements Inter, Heroes_inter {
    public Thrall(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String name() {
        return "Тралл";
    }

    @Override
    public int mana() {
        return 100;
    }

    @Override
    public int kolichestwo_zakl() {
        return 23;
    }

    @Override
    public int lvl() {
        return 110;
    }

    @Override
    public String ataka() {
        return "Средняя";
    }

    @Override
    public int zashita() {
        return 93;
    }

    @Override
    public String peredwizhenie() {
        return "Средне-быстрая";
    }
}
