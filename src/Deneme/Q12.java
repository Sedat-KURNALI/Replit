package Deneme;

import java.util.Arrays;

public class Q12 {

    public static void main(String[] args) {
        //A?a??daki multi dimensional array?in i? array?lerindeki tum elemanlar?n
        //toplam?n? birer birer bulan ve herbir sonucu yeni bir array?in eleman? yapan
        // ve yeni array?i ekrana yazd?ran bir program yaz?n?z
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

        int arr[][] = {{1, 2, 3}, {4, 5, 11}, {6, 7}, {8, 9, 10}};
        int[] sumArr = new int[arr.length];
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            sumArr[i] = toplam;
            toplam = 0;
        }


        /* int i = 0;
        for (int[] each : arr) {
            for (int w : each) {
                toplam += w;
            }
            sumArr[i] = toplam;
            toplam = 0;
            i++;
        }*/

        System.out.println(Arrays.toString(sumArr));

    }
}
