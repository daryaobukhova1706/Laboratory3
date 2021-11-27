package com.company;

public class Shortmen {
    private String bigDuffelBag = " большой вещевой мешок, наполненный";

    public String getBigDuffelBag(){
        return this.bigDuffelBag;
    }

    public String bring(DifferentSeeds differentSeeds){
        return Time.INTHETIME.getTimeName() + Characters.SHORTMEN.getName()+ " принесли" + getBigDuffelBag() + differentSeeds.getTypeOfSeeds() + ".";
    }

    @Override
    public String toString() {
        return bigDuffelBag;
    }
}
