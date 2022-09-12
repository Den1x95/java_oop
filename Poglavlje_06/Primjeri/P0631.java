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
 * P0631
 * Primjer metode String objekta dokaz nepromijenjivosti.
 */
public class P0631 {
    
    public static void main(String[] args) {

        String tekst = "Pocetak: "; //duljina stringa je 9
        
        System.out.println("Stringovi: ");
        for (int i = 0; i < 10; i++) {
            tekst += i;
            System.out.print(tekst.length() + " ");
        }        
        
        System.out.println("\nStringBuilder: ");
        StringBuilder sb = new StringBuilder("Pocetak: ");
        
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            System.out.print(sb.capacity() + " "); //ispis kapaciteta
        }
        
    }
    
}
