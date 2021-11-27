package com.company;

import java.util.Objects;

public class Kolosok implements KolosokInterface{
    private String duffelBag = " вещевой мешок";

    public String getDuffelBag() {
        return this.duffelBag;
    }

    public String hear(){
        return "не слыхал ли "+Characters.KOLOSOK.getName()+" чего-нибудь о "+ Characters.DUNNO.getName() + " с " + Characters.ROLYPOLY.getName();
    }

    private String onTheWayBack = "в обратный путь.";
    private String behindTheBack = " за спину";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kolosok kolosok = (Kolosok) o;
        return Objects.equals(onTheWayBack, kolosok.onTheWayBack) && Objects.equals(behindTheBack, kolosok.behindTheBack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onTheWayBack, behindTheBack)*31;
    }

    @Override
    public String put() {
        return Time.FINALLY.getTimeName() + Characters.KOLOSOK.getName() + " приладил" + getDuffelBag() + behindTheBack;
    }

    @Override
    public String getReady() {
        return " и собрался " + onTheWayBack;
    }

}
