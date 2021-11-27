package com.company;

public enum Time {
    INTHETIME("В это время "),
    FINALLY("Наконец ");

    private String timeName;
    public String getTimeName(){
        return this.timeName;
    }

    Time (String timeName) {
        this.timeName= timeName;
    }

    @Override
    public String toString() {
        return timeName;
    }
}
