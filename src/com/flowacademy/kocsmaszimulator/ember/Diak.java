package com.flowacademy.kocsmaszimulator.ember;

public class Diak extends Ember {
    private int osztondij;

    public Diak(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem, penz);
    }

    public void tanul() {
        setPenz(getPenz() + osztondij);
    }

    public void tanul(int mennyit) {
        setPenz(getPenz() + osztondij*mennyit);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ösztöndíja " + osztondij + " pénz.";
    }

    public int getOsztondij() {
        return osztondij;
    }

    public void setOsztondij(int osztondij) {
        this.osztondij = osztondij;
    }
}
