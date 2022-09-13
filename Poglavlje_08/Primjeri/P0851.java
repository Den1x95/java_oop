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
 * P0851
 * Statički atributi i metode klasa pripadaju svim instancama i kreiraju se
 * prilikom čitanja klase od strane classloadera puno prije kreiranja prve
 * instance neke klase. Iz tog razloga statičke metode i atributi nemaju pristup
 * niti jednoj instanci, dok sve instance imaju pristup svim statičkim metodama
 * i atributima.
 *
 * Statičkim metodama i atributima se iz tog razloga ne pristupa preko
 * identifikatora instance već preko identifikatora klase.
 */
public class P0851 {

    public static void main(String[] args) {

        Klasa51 sk = new Klasa51();

        int a = sk.KONSTANTA;               // ovako se moze pozvati
        int b = Klasa51.KONSTANTA;          // ovako se treba pozvati

        String s = sk.staticMetoda();       // ovako se moze pozvati
        String t = Klasa51.staticMetoda();  // ovako se treba pozvati

    }
}
class Klasa51 {

    static final int KONSTANTA = 5;

    static String staticMetoda() {
        return "ja samo nesto govorim";
    }
}
