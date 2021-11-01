/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadumodifikasi;

import java.util.Random;

/**
 *
 * @author USER
 */
class Dadumodif {
    private final Random random;


    Dadumodif() {
        random = new Random();
    }

    int[] parse(String kode) {
        if (!kode.matches("\\d*d\\d++\\d*")) {
            int[] nol = {0};
            return nol;
        }
        String[] split_d = kode.split("d", 2);
        String[] split_plus = split_d[1].split("\\+", 2);
        if (split_d[0].equals("")) {
            split_d[0] = "1";


        }
        return d(Integer.parseInt(split_d[1]), Integer.parseInt(split_d[0]));
    }

    int[] d(int sides, int count) {
        int[] hasil = new int[count+1];
        for (int i = 0; i < count; i++) {
            hasil[i+1] = random.nextInt(sides) + 1;
            hasil[0] += hasil[i+1];
        }
        return hasil;
    }
}