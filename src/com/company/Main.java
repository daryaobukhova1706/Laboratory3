package com.company;

public class Main {

    public static void main(String[] args) {
        Doono doono = new Doono();
        Kolosok kolosok = new Kolosok();
        Shortmen shortmen = new Shortmen();
        DifferentSeeds differentSeeds=new DifferentSeeds();
        Shoots shoots = new Shoots();
        GroundSeeds groundSeeds = new GroundSeeds();

        System.out.println(doono.orderToPrepare()+doono.orderToPrepare(differentSeeds)+doono.beginToAsk()+kolosok.hear());
        System.out.println(shortmen.bring(differentSeeds));
        System.out.println(doono.explainHowToPlant()+doono.explainHowToPlant(groundSeeds)+doono.explainHowToCare()+doono.explainHowToCare(shoots));
        System.out.println(kolosok.put()+kolosok.getReady());

    }
}
