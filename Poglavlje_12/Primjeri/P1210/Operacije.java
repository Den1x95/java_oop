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
package Poglavlje12.Primjeri.P1210;

/**
 * Enum konstante naslijeđuju klasu u kojoj su deklarirane. Ukoliko enum
 * klasa ima deklariranu apstraktnu klasu enum konstanta ju mora implementirati.
 */
public enum Operacije {

    PLUS("+") {

        @Override
        double apply(double x, double y) {
            return x + y;
        }
        
        void test() {
            System.out.println("u testu");
        }
    },
    MINUS("-") {

        double apply(double x, double y) {
            return x - y;
        }
    },
    PUTA("*") {

        double apply(double x, double y) {
            return x * y;
        }
    },
    DIJELJENO("/") {

        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String simbol;

    Operacije(String simb) {
        this.simbol = simb;
    }

    @Override
    public String toString() {
        return simbol;
    }

    abstract double apply(double x, double y);
}
