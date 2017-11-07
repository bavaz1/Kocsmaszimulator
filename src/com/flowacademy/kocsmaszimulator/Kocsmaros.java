package com.flowacademy.kocsmaszimulator;

public class Kocsmaros {
    private String nev;
    private int penz;
    private boolean kocsmaban = false;
    private static int koszosPoharak = 0;

    public Kocsmaros(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public boolean isKocsmaban() {
        return kocsmaban;
    }

    public static int getKoszosPoharak() {
        return koszosPoharak;
    }

    public void setKoszosPoharak() {
        this.koszosPoharak++;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = this.penz + penz;
    }

    public void dolgozik(){
        kocsmaban = true;
        System.out.println(nev + " a kocsma dolgozója megérkezett és beállt a pult mögé.");
    }

    public void hazamegy(){
        kocsmaban = false;
        System.out.println(nev + " befejezte a kiszolgálást mára.");
    }

    public void elmos(){
        if (koszosPoharak > 0){
            koszosPoharak--;
            if (koszosPoharak > 0) {
                System.out.println(nev + " elmosott egy poharat. Még van " + koszosPoharak + " koszos.");
            } else {
                System.out.println(nev + " elmosta az utolsó koszos poharat.");
            }
        } else {
            System.out.println("Nincs koszos pohár.");
        }
    }

    @Override
    public String toString() {
        return nev + " a kocsma dolgozója" +
                ", pénze " + penz +
                " és " + ((kocsmaban == true) ? "jelenleg a kocsmában dolgozik." : "jelenleg nincs a kocsmában.");
    }
}
