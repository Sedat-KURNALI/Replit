package trArray;

import java.util.Arrays;

public class TR_Array_03 {
    public static void main(String[] args) {
        /*
            Arraydeki sayilarin ortalamasini hesaplayan Java Kodunu yaziniz.
            Array =  [20, 30, 25, 35, -16, 60, -100 ]            
            Beklenen Cikti:
            Array Sayilarinin ortalamasi: 7.0
        */
        int[] arr = {20, 30, 25, 35, -16, 60, -100};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        System.out.println("Array Sayilarinin ortalamasi: " + (double)(toplam/ arr.length));
    }
}
