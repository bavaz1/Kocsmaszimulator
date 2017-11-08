package com.flowacademy.kocsmaszimulator.ital;

public class Kevert extends Ital {

    public Kevert(Ital it1, Ital it2) {
        super("Kevert", 10, (it1.getAlkoholtartalom() + it2.getAlkoholtartalom() / 2));
    }

    public Kevert(Ital it1, Ital it2, Ital it3) {
        super("Kevert", 10, (it1.getAlkoholtartalom() + it2.getAlkoholtartalom() + it3.getAlkoholtartalom()) / 3);
    }

    public Kevert(Ital it1, Ital it2, Ital it3, Ital it4) {
        super("Kevert", 10, (it1.getAlkoholtartalom() + it2.getAlkoholtartalom() + it3.getAlkoholtartalom() + it4.getAlkoholtartalom()) / 4);
    }
}
