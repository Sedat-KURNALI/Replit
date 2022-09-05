package trArray;

import java.util.*;

public class TR_Array_08 {
    public static void main(String[] args) {
        /*
            Array listesindeki 2. en buyuk sayiyi bulan Java Kodunu yaziniz.
            Array: [1232,2345,5467,678,3454,2312,3451]
        */
        List<Integer> list = new ArrayList<>(Arrays.asList(1232, 2345, 5467, 678, 3454, 2312, 3451));
        Collections.sort(list);
        System.out.println("listenin 2. en buyuk sayisi : " + list.get(list.size() - 2));
    }
}

