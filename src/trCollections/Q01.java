package trCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
      /*Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
        Array elemanları:  siyah,sari,mavi,turuncu
        Beklenen Çıktı:
        siyah
        sari
        mavi
        turuncu
      */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("siyah", "sari", "mavi", "turuncu"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
