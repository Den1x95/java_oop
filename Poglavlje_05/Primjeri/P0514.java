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
 * P0514 Usporedba referenci na objekte
 */
public class P0514 {

    public static void main(String[] args) {

        Date dt1 = new Date();
        Date dt2 = new Date();
        printDate(dt1, dt2);

        doSomeSleeping(2000);
        dt2 = new Date();
        printDate(dt1, dt2);

        doSomeSleeping(2000);
        dt2 = dt1;
        printDate(dt1, dt2);

    }

    static void printDate(Date d1, Date d2) {
        System.out.printf("Provjera jednakosti \n");
        System.out.printf("   datum 1 i datum 2 su jednaki po vrijednosti: %s \n", d1.equals(d2));
        System.out.printf("   datum 1 i datum 2 su jednaki po referenci: %s \n", d1 == d2);
    }

    static void doSomeSleeping(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
}
