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
 * P0731
 * Parametar metode main, polje Stringova.
 * Prenošenje vrijednosti polja pomoću argumenata:
 * java imePrograma param1 param2 param3
 */
class P0731 {

    public static void main(String[] args) {

        int duljinaPolja = args.length;
        String prviElement = args[0];
        String zadnjiElement = args[duljinaPolja - 1];

        System.out.format("Prvi element polja: %s \n"
                + "Zadnji element polja: %s \n"
                + "Duljina polja: %d \n",
                prviElement, zadnjiElement, duljinaPolja);
    }
}
