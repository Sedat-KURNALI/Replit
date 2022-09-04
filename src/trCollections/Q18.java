package trCollections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q18 {
    public static void main(String[] args) {
        /*
            Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
            priority queue elemanları: sari,yesil,mavi,kirmizi
            Beklenen Çıktı:
            Priority Queue elemanlari: [kirmizi, mavi, yesil, sari]
        */
        PriorityQueue<String> prq = new PriorityQueue<>(Arrays.asList( "kirmizi", "mavi","yesil", "sari"));
        System.out.println("Priority Queue elemanlari: " + prq);
    }
}
