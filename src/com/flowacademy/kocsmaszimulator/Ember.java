package com.flowacademy.kocsmaszimulator;

public class Ember {
    private String nev;
    private int kor;
    private boolean nem;
    private int reszegseg = 0;
    private int penz;
    private boolean isKocsmaban = false;
    private static int EMBEREK_SZAMA = 0;
    public static final int RESZEGSEG_KORLAT = 40;

    public Ember(String nev, int kor, boolean nem, int penz) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.penz = penz;
        this.EMBEREK_SZAMA++;
    }

    public void kiir(){
        System.out.println("Szia, az én nevem " + nev + "\n" + kor + " éves vagyok\n" + ((nem == true) ? "Férfi" : "Nő")
                + ", és " + penz + " pénzem van.");
    }

    public void alszik(){
        reszegseg = 0;
        System.out.println(nev + " elaludt.");
    }

    public void hazamegy(){
        isKocsmaban = false;
        System.out.println(nev + " elfáradt, hazamegy, viszlát.");
    }

    public void jon(){
        isKocsmaban = true;
        System.out.println(nev + " bejött a kocsmába, üdvözöllek.");
    }

    //Iszik metódusok létrehozása
    public void iszik(Kocsmaros kocsmaros){
        if (kocsmaros.isKocsmaban() == true) {
            if (isKocsmaban == true && penz > 0) {
                penz--;
                reszegseg++;
                kocsmaros.setKoszosPoharak();
                kocsmaros.setPenz(1);
                System.out.println(nev + " ivott egy pohárral. Pénze eggyel csökkent, míg részegsége eggyel nőtt.");
                if (reszegseg >= RESZEGSEG_KORLAT) {
                    System.out.println("Mivel " + nev + " lerészegedett, mindenkinek jobb lesz, ha lepihen.");
                    alszik();
                }
            } else {
                if (penz > 0){
                    System.out.println(nev + " nem tartózkodik a kocsmában.");
                } else {
                    System.out.println(nev + " nem rendelkezik elegendő pénzzel, hogy ilyet fogyasszon.");
                }
            }
        } else {
            System.out.println("A kocsmáros(" + kocsmaros.getNev() + ") jelenleg nem tartózkodik a kocsmában.");
        }
    }

    public void iszik(Kocsmaros kocsmaros, Ital ital){
        if (kocsmaros.isKocsmaban() == true) {
            int italAra = ital.getAr();
            int italAlkoholtartalma = ital.getAlkoholtartalom();
            String italNev = ital.getNev();
            if (isKocsmaban == true && penz >= italAra) {
                penz -= italAra;
                reszegseg += italAlkoholtartalma;
                kocsmaros.setKoszosPoharak();
                kocsmaros.setPenz(italAra);
                System.out.println(nev + " ivott egy " + italNev + "-t. Pénze " + italAra + "-el csökkent, míg részegsége "
                        + italAlkoholtartalma + "-el nőtt.");
                if (reszegseg >= RESZEGSEG_KORLAT) {
                    System.out.println("Mivel " + nev + " lerészegedett, mindenkinek jobb lesz, ha lepihen.");
                    alszik();
                }
            } else {
                if (penz >= italAra) {
                    System.out.println(nev + " nem tartózkodik a kocsmában.");
                } else {
                    System.out.println(nev + " nem rendelkezik elegendő pénzzel, hogy " + italNev + "-t fogyasszon.");
                }
            }
        } else {
            System.out.println("A kocsmáros(" + kocsmaros.getNev() + ") jelenleg nem tartózkodik a kocsmában.");
        }
    }

    public static int getEmberekSzama() {
        return EMBEREK_SZAMA;
    }

    @Override
    public String toString() {
        return "Emberünk " +
                "neve " + nev +
                ", " + kor + " éves " +
                ((nem == true) ? "férfi" : "nő") +
                ", részegsége " + reszegseg +
                ", pénze " + penz +
                " és " + ((isKocsmaban == true) ? "jelenleg a kocsmában tartózkodik." : "jelenleg nincs a kocsmában.");
    }
}