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
 * P0423
 * Primjer call-by-value pri pozivu metode. Java nema call-by reference poziv.
 *
 * Problem: Zelimo promijeniti vrijednost varijable koju proslijedjujemo kao
 * parametar unutar metode.
 */
class P0423 {

    public static void main(String[] args) {

        int a = 3;

        System.out.println("program: parametar koji dajemo: " + a);
        metodaCall(a);
        System.out.println("program: parametar koji smo dali: " + a);
    }

    static void metodaCall(int a) {

        System.out.println("metoda: parametar koji smo dobili: " + a);
        a = a + 3;
        System.out.println("metoda: parametar nakon povećanja: " + a);
    }
}
