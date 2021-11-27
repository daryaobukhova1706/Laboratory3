package com.company;

public class Doono implements DoonoInterface {

    @Override
    public String orderToPrepare(){
        return Characters.DOONO.getName()+" велел приготовить "+Characters.SHORTMEN.getName();
    }

    public String orderToPrepare(DifferentSeeds differentSeeds){
        return differentSeeds.getTypeOfSeeds() + " для " + Characters.KOLOSOK.getName();
    }

    @Override
    public String beginToAsk() {
        return ", а сам стал расспрашивать,";
    }

    @Override
    public String explainHowToPlant() {
        return Characters.DOONO.getName() + " объяснил " + Characters.KOLOSOK.getName() + ", как сажать ";
    }

    public String explainHowToPlant(GroundSeeds groundSeeds){
        return groundSeeds.getTypeOfSeeds();
    }

    @Override
    public String explainHowToCare() {
        return " и как ухаживать за";
    }

    public String explainHowToCare(Shoots shoots) {
        return shoots.getTypeOfSeeds();
    }

}
