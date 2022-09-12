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
 * P0442
 * Primjer preopterecenja metoda, potpis metode s jednim parametrom
 */
class P0442 {

    public static void main(String[] args) {

        short s = 1;

        metodaOverload(s);
        metodaOverload(2);
        metodaOverload(3L);
        metodaOverload(4F);
        metodaOverload(5.0);
    }

    static void metodaOverload(short a) {
        System.out.format("parametri short: %d \n", a);
    }

    static void metodaOverload(int a) {
        System.out.format("parametri int: %d \n", a);
    }

    static void metodaOverload(long a) {
        System.out.format("parametri long: %d \n", a);
    }

    static void metodaOverload(float a) {
        System.out.format("parametri float: %.2f \n", a);
    }

    static void metodaOverload(double a) {
        System.out.format("parametri double: %.2f \n", a);
    }
}
