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
 * P0335 Koristenje povratnih vrijednosti metoda u bloku uvjeta
 */
public class P0335 {

    public static void main(String[] args) {

//        java.util.Scanner sc = new java.util.Scanner("1 2 3 4 5 6 7 8 9");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        /*
         * u bloku uvjeta mo�emo koristiti bilo koju metodu koja vra�a tip boolean
         * naredbu is bloka naredbi mo�emo upisati u inkrementalni blok
         */

        for (int i = 0; sc.hasNext(); i = sc.nextInt(), System.out.println(i));

    }
}
