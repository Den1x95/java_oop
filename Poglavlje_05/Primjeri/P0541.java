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
 * P0541 Primjer wrapper klase i autoboxinga
 */
public class P0541 {

    public static void main(String[] args) {

        Integer a = new Integer("5");
        int ia = a.intValue();
        int ib = Integer.parseInt("6");
        Integer ic = Integer.valueOf("7");
        System.out.printf("a: %d, ia: %d, ib: %d, ic: %d \n", a, ia, ib, ic);

        Integer b = new Integer(12);
        int c = a + b;
        System.out.printf("%d + %d = %d \n", a, b, c);

    }
}
