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
 * P0713
 * Ispisivanje elemenata polja
 */
class P0713 {

    public static void main(String[] args) {

        int[] polje = new int[]{2, 4, 6, 8};
        int[] polje1 = new int[4];        

        System.out.println("Polje: " + polje);
        System.out.println("Elementi polja: ");
        elementiPolja(polje);

    }

    private static void elementiPolja(int[] p) {

        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", ");
        }

    }
}
