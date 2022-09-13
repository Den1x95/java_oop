/*
 **********************************************************
 *                                                        *
 *       Objektno-orijentirano programiranje u Javi.      *
 *                                                        *
 *             Copyright © 2022 Vedran Novak              *
 *                  www.vedrannovak.com                   *
 *                                                        *
 **********************************************************
 */

/**
 * P0852
 * Statički atributi i metode klasa.
 */
class P0852 {

    public static void main(String[] args) {

        Klasa52 s1 = new Klasa52();
        Klasa52 s2 = new Klasa52();

//        s1.setStanje(13);
        s2.setStanje(19);

        System.out.format("s1: %d, s2: %d \n", s1.getStanje(), s2.getStanje());
        System.out.format("faktori s1: %d, faktori s2: %d \n", s1.getFaktor(),
                s2.getFaktor());

        s1.faktor();
        s2.faktor();

        System.out.format("s1: %d, s2: %d \n", s1.getStanje(), s2.getStanje());

        Klasa52.setFaktor(2);
        System.out.format("faktori s1: %d, faktori s2: %d \n", s1.getFaktor(),
                s2.getFaktor());

    }
}

class Klasa52 {

    private static int faktor = 5;
    private int stanje;

    public static int getFaktor() {
        return faktor;
    }

    public static void setFaktor(int faktor) {
        Klasa52.faktor = faktor;
    }

    public int getStanje() {        
        return stanje;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    public void faktor() {

        stanje = stanje * faktor;
    }
}
