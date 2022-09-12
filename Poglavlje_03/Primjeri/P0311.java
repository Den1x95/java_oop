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
 * P0311 Primjer while petlje, ukoliko zelimo naredbe unutar petlje izvrsiti
 * npr. 5 puta, potrebna nam je kontrolna varijabla ciju vrijednost mozemo
 * povecati u svakom prolazu petlje. Petlja ce se izvrsavati toliko dugo dok
 * je uvjet istinit. Varijablu povecavamo za 1 prilikom svakog prolaska, kao
 * zadnju naredbu.
 */
public class P0311 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5) {
            System.out.println("Prolazak br: " + i);
            i = i + 1; // ovo je isto kao i i++, i += 1
        }

    }
}