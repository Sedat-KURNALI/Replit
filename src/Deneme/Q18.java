package Deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        /*
            TASK :
             kullan?c?dan al?nan bir  String'deki herbir  karakterin adedini
             bir array i?inde yazd?ran bir java program? yaz?n.
             String  "Javacilar cook afilli" ise cevap ??yle olmal?d?r:
             { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";
        List<String> harfler = new ArrayList<>();
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (!harfler.contains(str.substring(i, i + 1))) {
                harfler.add(str.substring(i, i + 1));
                sayilar.add(1);
            } else {
                sayilar.set(harfler.indexOf(str.substring(i, i + 1)), sayilar.get(harfler.indexOf(str.substring(i, i + 1))) + 1);
            }
        }
        for (int i = 0; i < harfler.size(); i++) {
            System.out.print(harfler.get(i) + " = " + sayilar.get(i) + "    ");
        }

        System.out.println("\n============================");

        String[] arr = str.split("");
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                count++;
            } else {
                System.out.print(arr[i] + " = " + count + "   ");
                count = 1;
            }
        }
        if (arr[arr.length - 1].equals(arr[arr.length - 2])) {
            count++;
            System.out.print(arr[arr.length - 1] + " = " + count);
        } else {
            System.out.print(arr[arr.length - 1] + " = " + 1);
        }
    }
}