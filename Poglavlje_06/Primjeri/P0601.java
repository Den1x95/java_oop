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
 * P0601
 * Primjer kreiranja stringova
 */
public class P0601 {

    public static void main(String[] args) {

        // kreiranje Stringa koristeci string literal
        String s1 = "Java je Cool!";

        // kreiranje Stringa koristeci constant expression
        String s2 = "Stringovi" + " su Cool!";

        // kreiranje Stringa koristeci String objekt
        String s3 = new String("Stringovi nisu komplicirani!");

        // kreiranje Stringa koristeci String objekt - odvojena inicijalizacija
        String s4 = new String();
        s4 = "Java nije komplicirana!";
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
