package trCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q11 {
    public static void main(String[] args) {
    /*
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        HashSet List: sari,mavi,kirmizi,yesil,mor
        Beklenen Çıktı:
            TreeSet elements:
            kirmizi
            mavi
            mor
            sari
            yesil
    */

        Set<String> hs = new HashSet<>(Arrays.asList("sari", "mavi", "kirmizi", "yesil", "mor"));

        Set<String> ts = new TreeSet<>(hs);

        System.out.println("TreeSet elements:");
        for (String w : ts) {
            System.out.println(w);
        }

    }
}
