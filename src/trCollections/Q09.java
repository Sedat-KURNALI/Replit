package trCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q09 {
    public static void main(String[] args) {
        /*
            Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
            LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
            Beklenen Çıktı:
            Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
            LinkedList Tersi:
                mor
                beyaz
                kirmizi
                yesil
                mavi
                sari
        */
        //1.yol
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("sari", "mavi", "yesil", "kirmizi", "beyaz", "mor"));
        System.out.println("Orijinal linked list: " + ll);
        System.out.println("LinkedList Tersi:");
        ListIterator<String> it = ll.listIterator();
        while (it.hasNext()) {
            it.next();
        }
        while (it.hasPrevious()) {
            System.out.println(it.previous());

        }
        System.out.println("=================================================================");
        System.out.println("LinkedList Tersi:");
        //2.yol
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("sari", "mavi", "yesil", "kirmizi", "beyaz", "mor"));
        Iterator<String> it2 = ll2.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }

}




