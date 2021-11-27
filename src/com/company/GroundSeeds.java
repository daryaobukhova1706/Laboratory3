package com.company;

public class GroundSeeds extends Seeds {
    private String typeOfSeeds = " земные семена";

    @Override
    public String getTypeOfSeeds(){
        return typeOfSeeds;
    }

    @Override
    public String toString() {
        return typeOfSeeds;
    }
}
