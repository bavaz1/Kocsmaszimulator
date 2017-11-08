package com.flowacademy.kocsmaszimulator.ember;

public class Kocsmaros extends Ember {
    private boolean kocsmaban = false;
    private static int KOSZOS_POHARAK = 0;

    public Kocsmaros(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem, penz);
    }


    public boolean isKocsmaban() {
        return kocsmaban;
    }

    public static int getKoszosPoharak() {
        return KOSZOS_POHARAK;
    }

    public void incKoszosPoharak() {
        this.KOSZOS_POHARAK++;
    }

    public void decKoszosPoharak() {
        this.KOSZOS_POHARAK--;
    }

    public void dolgozik(){
        kocsmaban = true;
        System.out.println(getNev() + " a kocsma dolgozója megérkezett és beállt a pult mögé.");
    }

    public void hazamegy(){
        kocsmaban = false;
        System.out.println(getNev() + " befejezte a kiszolgálást mára.");
    }

    public void elmos(){
        if (KOSZOS_POHARAK > 0){
            decKoszosPoharak();
            if (KOSZOS_POHARAK > 0) {
                System.out.println(getNev() + " elmosott egy poharat. Még van " + KOSZOS_POHARAK + " koszos.");
            } else {
                System.out.println(getNev() + " elmosta az utolsó koszos poharat.");
            }
        } else {
            System.out.println("Nincs koszos pohár.");
        }
    }

    @Override
    public String toString() {
        return getNev() + " a kocsma dolgozója" +
                ", pénze " + getPenz() +
                " és " + ((kocsmaban == true) ? "jelenleg a kocsmában dolgozik." : "jelenleg nincs a kocsmában.");
    }
}
