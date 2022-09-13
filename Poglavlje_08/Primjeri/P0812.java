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


/**
 * P0812
 * Deklaracija klase i metode unutar klase. Svaki objekt ima istu
 * funkcionalnost metode ali različito stanje atributa te poziv iste metode
 * dva različita objekta ne moraju imati isti rezultat.
 */
class P0812 {

    public static void main(String[] args) {

        Klasa12 objekt1 = new Klasa12();
        Klasa12 objekt2 = new Klasa12();
        System.out.printf("Objekt1 : %d, %s \n", objekt1.a, objekt1.s);
        System.out.printf("Objekt2 : %d, %s \n", objekt2.a, objekt2.s);

        objekt1.a = 12;
        objekt2.a = 38;

        String str1 = objekt1.nekaMetoda();
        System.out.printf("Objekt metoda : %s \n", str1);
        System.out.printf("Objekt metoda : %s \n", objekt2.nekaMetoda());

    }
}

class Klasa12 {

    String s = "jedan string";
    int a;

    String nekaMetoda() {
        return (s + " iz metode, a = " + a);
    }
}