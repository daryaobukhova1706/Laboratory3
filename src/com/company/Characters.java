package com.company;

public enum Characters {
    DOONO("Знайка"),
    DUNNO("Незнайке"),
    KOLOSOK("Колосок"),
    ROLYPOLY("Пончиком."),
    SHORTMEN("коротышки");
    private String name;
    public String getName(){
        return this.name;
    }

    Characters(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return name;
    }
}
