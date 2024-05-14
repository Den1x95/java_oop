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
package Poglavlje14.Primjeri;

/**
 * Volatile
 */
class P1441 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new VolTest41()).start();
        }

    }
}
class VolTest41 implements Runnable {

    static volatile int a = 0;

    static void one() {
        a++;
    }

    static void two() {
        System.out.println("a=" + a);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            one();
            two();
        }
    }
}
