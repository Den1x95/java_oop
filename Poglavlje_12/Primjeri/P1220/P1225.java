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
package Poglavlje12.Primjeri.P1220;

/**
 * P1225
 * Primjer anonimne unutarnje klase: konkretna implementacija metode status()
 * prilikom kreiranja instance klase osoba.
 */
public class P1225 {

    public static void main(String[] args) {

        Osoba os1 = new Osoba("Mirko", "Mirkić") {

            @Override
            public String status() {
                return getIme() + " " + getPrezime() + " je student";
            }
        };

        Osoba os2 = new Osoba("Živko", "Živkić") {

            @Override
            public String status() {
                return getIme() + " " + getPrezime()
                        + " nije student, on je završio.";
            }            
        };

        System.out.println(os1.status());
        System.out.println(os2.status());

    }
}
