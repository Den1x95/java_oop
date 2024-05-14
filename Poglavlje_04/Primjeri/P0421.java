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
 * P0421 Primjer parametara metode.
 */
class P0421 {

    public static void main(String[] args) {

        int zbroj1 = metodaZbroji(5, 7);

        int a = 5;
        int b = 78;
        int zbroj2 = metodaZbroji(a, b);
		
		System.out.printf ("%d, %d", zbroj1, zbroj2);
    }

    static int metodaZbroji(int i, int j) {

        return i + j;
    }
}
