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
 * P0424
 * Primjer call-by-value pri pozivu metode. Java nema call-by reference poziv.
 *
 * Rjesenje: vrijednost koju smo izracunali moramo vratiti natrag pozivatelju.
 */
class P0424 {

    public static void main(String[] args) {

        int a = 3;

        System.out.println("program: parametar koji dajemo: " + a);
        a = metodaCall(a);
        System.out.println("program: parametar koji smo dali: " + a);
    }

    static int metodaCall(int a) {

        System.out.println("metoda: parametar koji smo dobili: " + a);
        a = a + 3;
        System.out.println("metoda: parametar koji vraćamo: " + a);
        return a;
    }
    
}
