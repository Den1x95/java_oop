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

import java.util.Date;

/**
 * P0521 Primjer gubljenja referenci na objekt
 */
public class P0521 {

    public static void main(String[] args) {

        // dvije reference pokazuju na isti objekt
        Date d1 = new Date();
        Date d2 = d1;

        // samo jedna referenca na objekt je ostala
        d1 = null;

        // nema vise referenci na objekt, objekt ce biti izbrisan od GC-a.
        d2 = null;

    }
}
