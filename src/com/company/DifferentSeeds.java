package com.company;

public class DifferentSeeds extends Seeds{
    private String typeOfSeeds = " разных семян";

    @Override
    public String getTypeOfSeeds(){
        return typeOfSeeds;
    }

    @Override
    public String toString() {
        return typeOfSeeds;
    }
}
