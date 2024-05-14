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
 * P0282
 * Primjer korištenja ternarnog operatora
 */
public class P0282 {

    public static void main(String[] args) {

        int brojKuglica = 5;

        System.out.println("Imamo " + brojKuglica
                + (((brojKuglica < 2) ? " kuglicu" : (brojKuglica < 5) ? " kuglice" : " kuglica"))
                + " u posudi");

    }
}
