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
 * P0742 Vararg vs widening vs Autoboxing
 */
class P0742 {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        metoda(a, b);

    }

    static void metoda(int prvi, int drugi) {
        System.out.println("obično!");
    }
    
    static void metoda(long prvi, long drugi) {
        System.out.println("widenind!");
    }
    static void metoda(Integer a, Integer b) {
        System.out.println("Autoboxing!");
    }

    static void metoda(int... polje) {
        System.out.println("vararg!");
    }
}
