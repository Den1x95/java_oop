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
 * P0334 Primjer beskonacne for petlje, blokovi for petlje mogu biti prazni.
 */
public class P0334 {

    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++)
            ;
        
        {
            System.out.println(i);
        }    
    }
}
