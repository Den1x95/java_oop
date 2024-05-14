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

/**
 * P0443
 * Primjer preopterecenja metoda, dozvoljene su razlicite povratne vrijednosti.
 */
class P0443 {

    public static void main(String[] args) {

        short s = 1;

        metodaOverload(s);
        metodaOverload(2);
        metodaOverload(3L);
        metodaOverload(4F);
        metodaOverload(5.0);
    }

    static int metodaOverload(short a) {
        System.out.format("parametri short: %d \n", a);
        return 4;
    }

    static double metodaOverload(int a) {
        System.out.format("parametri int: %d \n", a);
        return 6.4;
    }

    static void metodaOverload(long a) {
        System.out.format("parametri long: %d \n", a);
    }

    static short metodaOverload(float a) {
        System.out.format("parametri float: %.2f \n", a);
        return 4;
    }

    static long metodaOverload(double a) {
        System.out.format("parametri double: %.2f \n", a);
        return 4L;
    }
}
