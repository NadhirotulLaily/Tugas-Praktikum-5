/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadumodifikasi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DaduModifikasi {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dadumodif dadumodif = new Dadumodif();
        String kode;

        while (true) {
            kode = in.nextLine().toLowerCase();
            if (kode.equals("q"))
                break;
            
            int[] hasil = dadumodif.parse(kode);
            for (int i = 1; i < hasil.length; i++) {
                if (i+1 == hasil.length)
                    System.out.print(hasil[i]);
                else
                    System.out.print(hasil[i] + "+");
            }
            System.out.print(" = " + hasil[0]);
            // Untuk new line
            System.out.println("");
        }
    }
}
        
