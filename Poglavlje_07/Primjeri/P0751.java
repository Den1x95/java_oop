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
 * P0751
 * for-each petlja
 * Podatke možemo samo čitati, smjer čitanja je uvijek od prvog prema zadnjem
 * elementu polja te se prolaze svi elementi, od prvog do zadnjeg elementa.
 */
class P0751 {

    public static void main(String[] args) {

        String[] polje = {
            "prvi",
            "drugi",
            "treci",
            "cetvrti",
            "peti"
        };

        for(String element : polje) {
            
            System.out.println(element);
            element = "sd";
        }

    }
}
