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
 * P0512 Pozivanje metoda objekata
 */
public class P0512 {

    public static void main(String[] args) {

        Date dt = new Date();

        System.out.println(dt);
        System.out.println(dt.getTime());

    }
}
