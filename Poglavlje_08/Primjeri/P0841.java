/*
 **********************************************************
 *                                                        *
 *       Objektno-orijentirano programiranje u Javi.      *
 *                                                        *
 *             Copyright © 2024 Vedran Novak              *
 *                  www.vedrannovak.com                   *
 *                                                        *
 **********************************************************
 */

import java.util.Date;

/**
 * P0841 Get i set metode, enkapsulacija. Enkapsulacija je postupak skrivanja
 * atributa i dozvoljavanje pristupa vrijednostima atributa samo preko metoda.
 * Metode koje čitaju i mijenjaju vrijednost nekog atributa se nazivaju mutatori
 * (mutators) i moramo točno pratiti pravila nazivanja takvih metoda:
 * getImeAtributa i setImeAtributa. Svaka klasa mora biti dobro enkapsulirana.
 */
public class P0841 {

    public static void main(String[] args) {

        Klasa41 objekt1 = new Klasa41();
        System.out.println("Objekt1 : " + objekt1.getA());
        objekt1.setA(3);
        System.out.println("Objekt1 : " + objekt1.getA());

    }
}

class Klasa41 {

    private String s;
    private int a;
    private char[] poljeC;
    private Date d;

    public int getA() {
        return a;
    }

    public void setA(int b) {

        if (b < 0) {
            return;
        }

        a = b;
    }

    public char[] getPoljeC() {
        return poljeC;
    }

    public void setPoljeC(char[] poljeC) {
        this.poljeC = poljeC;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Date getD() {
        return d;
    }
}