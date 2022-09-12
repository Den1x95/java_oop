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
 * P0343 Primjer oznacene break naredbe. Oznakama oznacavamo deklaraciju petlje
 * navodeci u liniji prije deklaracije petlje. Koristenjem break ili continue
 * naredbe s oznakom definiramo na koju petlju se break ili continue odnosi.
 */
public class P0343 {

    public static void main(String[] args) {

        oznaka1:
        for (int i = 0; i < 10; i++) {

            oznaka2:
            for (int j = 0; j < 10; j++) {

                System.out.println("varijabla i: " + i);
                System.out.println("varijabla j: " + j);
                break oznaka2;

            }

            System.out.println("--- kraj unutarnje petlje ---");
        }

    }
}
