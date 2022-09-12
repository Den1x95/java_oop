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

import java.util.Date;

/**
 * P0511 Primjer deklaracije reference i instanciranja objekta.
 */
public class P0511 {

    public static void main(String[] args) {

        Date dt = null;
        System.out.println(dt);

        dt = new Date();
        System.out.println(dt);

    }
}
