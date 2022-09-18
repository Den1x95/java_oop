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
package Poglavlje14.primjeri;

/**
 * Volatile
 */
class P1442 {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(new VolTest42()).start();
        }

    }
}
class VolTest42 implements Runnable {

    static volatile int a = 0;
    static int b = 0;

    static synchronized  void one() {
        a++;
        b++;
    }

    static void two() {
        System.out.println("a=" + a + " b=" + b);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            one();
            two();
        }
    }
}
