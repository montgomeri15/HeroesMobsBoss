package com.company;

import com.company.Boss.Boss;
import com.company.Heroes.Lortemar;
import com.company.Heroes.Sylvana;
import com.company.Heroes.Thrall;
import com.company.Mobs.Mob_easy;
import com.company.Mobs.Mob_middle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Герои:\n");

        Thrall thrall = new Thrall("Герой", 60000, 480);
        System.out.println("Имя: " + thrall.name() + ". Мана: " + thrall.mana() + ". Кол-во заклинаний: " + thrall.kolichestwo_zakl() + ". Уровень: " + thrall.lvl());
        System.out.println("Скорость атаки: " + thrall.ataka() + ". Защита: " + thrall.zashita() + ". Скорость передвижения: " + thrall.peredwizhenie() + "\n");

        Lortemar lortemar = new Lortemar("Герой", 120000, 835);
        System.out.println("Имя: " + lortemar.name() + ". Мана: " + lortemar.mana() + ". Кол-во заклинаний: " + lortemar.kolichestwo_zakl() + ". Уровень: " + lortemar.lvl());
        System.out.println("Скорость атаки: " + lortemar.ataka() + ". Защита: " + lortemar.zashita() + ". Скорость передвижения: " + lortemar.peredwizhenie() + "\n");

        Sylvana sylvana = new Sylvana("Герой", 75000, 521);
        System.out.println("Имя: " + sylvana.name() + ". Мана: " + sylvana.mana() + ". Кол-во заклинаний: " + sylvana.kolichestwo_zakl() + ". Уровень: " + sylvana.lvl());
        System.out.println("Скорость атаки: " + sylvana.ataka() + ". Защита: " + sylvana.zashita() + ". Скорость передвижения: " + sylvana.peredwizhenie() + "\n");


        System.out.println("\nМобы:\n");

        Mob_easy mob_easy = new Mob_easy("Моб", 500, 60);
        System.out.println("Уровень моба: " + mob_easy.uroven());
        System.out.println("Скорость атаки: " + mob_easy.ataka() + ". Защита: " + mob_easy.zashita() + ". Скорость передвижения: " + mob_easy.peredwizhenie() + "\n");

        Mob_middle mob_middle = new Mob_middle("Моб", 850, 140);
        System.out.println("Уровень моба: " + mob_middle.uroven());
        System.out.println("Скорость атаки: " + mob_middle.ataka() + ". Защита: " + mob_middle.zashita() + ". Скорость передвижения: " + mob_middle.peredwizhenie() + "\n");


        System.out.println("\nБосс:\n");

        Boss boss = new Boss("Босс", 30000, 300);
        System.out.println("Имя босса: " + boss.name() + ". Кол-во заклинаний: " + boss.kolichestwo_zakl());
        System.out.println("Скорость атаки: " + boss.ataka() + ". Защита: " + boss.zashita() + ". Скорость передвижения: " + boss.peredwizhenie() + "\n");

    }
}
