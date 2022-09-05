package trArray;

import java.util.Arrays;

public class TR_Array_09 {
    public static void main(String[] args) {
        /*
            Array icerisindeki tek ve cift sayilarin kacar tane oldugunu bulan Java Kodu yaziniz.
            Array: [1,2,3,4,5,6,7,8,9]
            Beklenen cikti:
            Tek Sayilar: 5
            Cift Sayilar: 4
        */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ciftSayiAdeti = 0;
        int tekSayiAdeti = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ciftSayiAdeti++;
            } else {
                tekSayiAdeti++;
            }
        }
        System.out.println("Tek Sayilar: " + tekSayiAdeti);
        System.out.println("Cift Sayilar: " + ciftSayiAdeti);
    }
}

