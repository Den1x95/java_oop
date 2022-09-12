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
 * P0441
 * Primjer preopterecenja (overloading) metode. Metoda je jednoznacno
 * deklarirana svojim identifikatorom i tipovima parametara koje prima, tj.
 * moze postojati vise metoda istog imena, ali s razlicitim parametrima
 * (potpisima).
 */
class P0441 {

    public static void main(String[] args) {

        metodaOverload();
        metodaOverload(1);
        metodaOverload(2, 3);
    }

    static void metodaOverload() {
        System.out.format("parametri: ništa \n");
    }

    static void metodaOverload(int a) {
        System.out.format("parametri: %d \n", a);
    }

    static void metodaOverload(int a, int b) {
        System.out.format("parametri: %d, %d \n", a, b);
    }
}
