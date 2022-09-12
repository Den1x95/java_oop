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
 * P0522 Primjer gubljenja referenci na objekt.
 */
public class P0522 {

    public static void main(String[] args) {

        // dvije reference pokazuju na razlizite objekte
        Date d1 = new Date(); //1
        Date d2 = new Date(); //2

        d2 = d1; //koga ce GC pokupiti?

    }
}
