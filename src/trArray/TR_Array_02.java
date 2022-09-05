package trArray;

import java.util.Arrays;

public class TR_Array_02 {
    public static void main(String[] args) {
        /*
            Array deki sayilari tolpayan Java kodunu yaziniz.
            array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            Beklenen Cikti:
                Array toplami: 55
        */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("Array toplami: " + toplam);
    }
}

