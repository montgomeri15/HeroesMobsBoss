package com.company.Heroes;

import com.company.All;
import com.company.Inter;

public class Sylvana extends All implements Inter, Heroes_inter {
    public Sylvana(String specialisation, int health, int damage) {
        super(specialisation, health, damage);
    }

    @Override
    public String name() {
        return "Сильвана";
    }

    @Override
    public int mana() {
        return 79;
    }

    @Override
    public int kolichestwo_zakl() {
        return 26;
    }

    @Override
    public int lvl() {
        return 98;
    }

    @Override
    public String ataka() {
        return "Медленная";
    }

    @Override
    public int zashita() {
        return 102;
    }

    @Override
    public String peredwizhenie() {
        return "Средняя";
    }
}
