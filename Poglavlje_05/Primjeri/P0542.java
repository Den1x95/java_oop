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

/**
 * P0542 Overloading: Autoboxinga vs. Widening
 */
public class P0542 {

    public static void main(String[] args) {
        short shorty = 10;
        System.out.println("And the winner is: ");
        autoboxingVsWidening(shorty);
    }

    static void autoboxingVsWidening(Short pickMe) {
        System.out.println("Autoboxing!");
    }

    static void autoboxingVsWidening(int noPickMe) {
        System.out.println("Widening!");
    }
}
