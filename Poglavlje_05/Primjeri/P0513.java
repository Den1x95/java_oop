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
 * P0513 Reference na objekte
 */
public class P0513 {

    public static void main(String[] args) {

        Date dt1 = new Date();
        doSomeSleeping(2000);
        Date dt2 = new Date();
        doSomeSleeping(2000);
        Date dt3 = new Date();

        printDate(dt1, dt2, dt3);

        dt2 = dt1;
        printDate(dt1, dt2, dt3);

        dt3 = dt1;
        printDate(dt1, dt2, dt3);

    }

    static void printDate(Date d1, Date d2, Date d3) {
        System.out.printf("datum 1: %s, datum 2: %s , datum 3: %s \n", d1, d2, d3);
    }

    static void doSomeSleeping(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
}
