package com.flowacademy.kocsmaszimulator;

public class Main {
    public static void main(String[] args) {
        Ember janos = new Ember("János", 22, true, 30);
        Ember peter = new Ember("Péter", 24, true, 35);

        Kocsmaros kocsmaros = new Kocsmaros("Marika", 0);
        Kocsmaros kocsmaros2 = new Kocsmaros("Tamás", 0);

        Ital sor = new Ital("sör", 5,4);
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
        System.out.println(kocsmaros.toString());
        kocsmaros2.hazamegy();
        System.out.println(kocsmaros2.toString());
        System.out.println();
        janos.hazamegy();
        kocsmaros.hazamegy();
    }
}
