package com.flowacademy.kocsmaszimulator;

import com.flowacademy.kocsmaszimulator.ember.*;
import com.flowacademy.kocsmaszimulator.ital.*;

public class Main {
    public static void main(String[] args) {
        Ember janos = new Ember("János", 22, true, 30);
        Ember peter = new Ember("Péter", 24, true, 35);

        Kocsmaros kocsmaros = new Kocsmaros("Marika", 22, false, 0);
        Kocsmaros kocsmaros2 = new Kocsmaros("Tamás", 30, true, 0);

        Sor sor = new Sor("sör", 5,4);
        Ital pezsgo = new Ital("pezsgő", 10,12);
        Ital rum = new Ital("rum", 20,35);

        kocsmaros.dolgozik();
        kocsmaros.elmos();
        System.out.println();
        janos.jon();
        janos.kiir();
        System.out.println();
        peter.jon();
        System.out.println();
        janos.iszik(kocsmaros2, pezsgo);
        kocsmaros2.dolgozik();
        System.out.println();
        janos.iszik(kocsmaros2, pezsgo);
        peter.iszik(kocsmaros, rum);
        peter.iszik(kocsmaros, rum);
        peter.iszik(kocsmaros2, sor);
        System.out.println();
        System.out.println(peter.toString());
        System.out.println();
        peter.iszik(kocsmaros, pezsgo);
        System.out.println();
        System.out.println("A koszos poharak száma: " + Kocsmaros.getKoszosPoharak());
        kocsmaros.elmos();
        kocsmaros2.elmos();
        System.out.println();
        System.out.println(kocsmaros);
        kocsmaros2.hazamegy();
        System.out.println(kocsmaros2);
        System.out.println();
        System.out.println("---------------PART2---------------");


        Bor bor = new Bor("bor", 12, 10, 2014);
        Kevert kevert1 = new Kevert(sor, pezsgo, rum, bor);
        Kevert kevert2 = new Kevert(sor, bor);
        Ital viz = new Ital("víz", 2, 0);

        System.out.println();
        Diak tobias = new Diak("Tóbiás", 22, true, 5);
        System.out.println(tobias);
        tobias.setOsztondij(2);
        tobias.tanul(5);
        System.out.println(tobias);
        System.out.println();
        System.out.println();
        Kidobo bela = new Kidobo("Béla", 37, true, 50);
        bela.jon();
        System.out.println();
        bela.iszik(kocsmaros, kevert1);
        bela.szolgalatbaAll();
        bela.iszik(kocsmaros, rum);
        bela.iszik(kocsmaros, viz);
        System.out.println();
        System.out.println(Kidobo.getDolgoznakJelenleg() + " kidobó dolgozik jelenleg.");
        System.out.println(bela);
        System.out.println();
        janos.kotozkodik(tobias);
        System.out.println();
        kocsmaros.elmos();
        System.out.println();
        bela.szolgalatbolKilep();
        bela.iszik(kocsmaros, kevert2);
        bela.iszik(kocsmaros, bor);
        bela.hazamegy();
    }
}
