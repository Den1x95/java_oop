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
 * P0422
 * Primjer parametara metode.
 */
class P0422 {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        double d = 5.32;

        int z = metodaZbroji(a, b);
        double p = metodaPodijeli(b, d);

        System.out.format("%d + %d = %d \n", a, b, z);
        System.out.format("%.2f / %.2f = %.2f \n", (double)b, d, p);
        System.out.println("Svi su jednaki: " + metodaProvjeriJesuLiSviJednaki(a, b, (int)d));
    }

    static int metodaZbroji(int a, int b) {

        return a + b;
    }

    static double metodaPodijeli(int a, double b) {

        if(b != 0) {
            return a / b;
        }

        return 0;
    }

    static boolean metodaProvjeriJesuLiSviJednaki(int i, int j, int k) {

        return ((i == j) && (i == k) && (j == k));
    }
    
}
