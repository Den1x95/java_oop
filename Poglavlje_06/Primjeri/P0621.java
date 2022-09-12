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
 * P0621
 * Primjer neefikasnog koristenja string objekta. Za svaku iteraciju petlje
 * stvaramo novi string literal u string poolu.
 */
public class P0621 {

    public static void main(String[] args) {

        String str = "dobro jutro !";

        for (int i = 1; i < 1000; i++) {
            str = str + i;
        }

        System.out.println(str);

    }
}
