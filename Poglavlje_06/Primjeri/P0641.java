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
 * P0641
 * Primjer formatiranja stringova.
 */
public class P0641 {

    public static void main(String[] args) {

        Double d = 1234.1234;

        char c = 'x';

        String str = "Drugi string.";

        Date dt = new Date();
        
        String formatString =
                String.format("Double: %5.2f\nZnak je: %c\nString: %s\nDan: %tA\n", d, c, str, dt);

        System.out.print(formatString);

    }
}
