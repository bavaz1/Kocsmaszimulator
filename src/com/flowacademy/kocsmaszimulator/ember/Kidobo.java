package com.flowacademy.kocsmaszimulator.ember;

import com.flowacademy.kocsmaszimulator.ital.*;

public class Kidobo extends Ember {
    private boolean dolgozik;
    private static int DOLGOZNAK_JELENLEG = 0;

    public Kidobo(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem, penz);
    }

    public void szolgalatbaAll() {
        dolgozik = true;
        DOLGOZNAK_JELENLEG++;
        System.out.println(getNev() + " szolgálatba állt, mint kidobó.");
    }

    public void szolgalatbolKilep() {
        dolgozik = false;
        DOLGOZNAK_JELENLEG--;
        System.out.println(getNev() + " mostmár nem szolgál.");
    }

    @Override
    public void iszik(Kocsmaros kocsmaros, Ital ital) {
        int italAlkoholtartalma = ital.getAlkoholtartalom();
        if (dolgozik && italAlkoholtartalma != 0) {
            System.out.println("Szolgálatban nem ihat alkoholtartalmú italt.");
        } else {
            super.iszik(kocsmaros, ital);
        }
    }

    @Override
    public void iszik(Kocsmaros kocsmaros) {
        if (dolgozik) {
            System.out.println("Szolgálatban nem ihat alkoholtartalmú italt.");
        } else {
            super.iszik(kocsmaros);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ((dolgozik == true) ? " és kidobóként szolgál." : "");
    }

    public boolean isDolgozik() {
        return dolgozik;
    }

    public void setDolgozik(boolean dolgozik) {
        this.dolgozik = dolgozik;
    }

    public static int getDolgoznakJelenleg() {
        return DOLGOZNAK_JELENLEG;
    }

    public static void setDolgoznakJelenleg(int dolgoznakJelenleg) {
        DOLGOZNAK_JELENLEG = dolgoznakJelenleg;
    }
}
