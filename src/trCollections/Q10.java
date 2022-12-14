package trCollections;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
     /*
            Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
            LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
                **hint:  Collections.swap();**
            Beklenen Çıktı:
                Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
                Swap sonrasi durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
        */
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("mavi", "kirmizi", "beyaz", "siyah", "yesil", "turuncu"));
        System.out.println("Orjinal LinkedList: " + ll);
        Collections.swap(ll, 0, 3);
        System.out.println("Swap sonrasi durum: " + ll);
    }
}
