package com.flowacademy.kocsmaszimulator.ital;

public class Bor extends Ital {
    private int evjarat;

    public Bor(String nev, int ar, int alkoholtartalom, int evjarat) {
        super(nev, ar, alkoholtartalom);
        this.evjarat = evjarat;
    }
}
