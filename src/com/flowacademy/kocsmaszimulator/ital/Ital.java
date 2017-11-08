package com.flowacademy.kocsmaszimulator.ital;

public class Ital {
    private String nev;
    private int ar;
    private int alkoholtartalom;

    public Ital(String nev, int ar, int alkoholtartalom) {
        this.nev = nev;
        this.ar = ar;
        this.alkoholtartalom = alkoholtartalom;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getAlkoholtartalom() {
        return alkoholtartalom;
    }

    public void setAlkoholtartalom(int alkoholtartalom) {
        this.alkoholtartalom = alkoholtartalom;
    }
}
