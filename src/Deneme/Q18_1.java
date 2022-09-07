package Deneme;

import java.util.Arrays;

public class Q18_1 {
    public static void main(String[] args) {
        /*
        javacilar cok afilli

         */
        String str = "Javacilar cook afilli";
        String[] arr = str.split("");
        Arrays.sort(arr);

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            sayac = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].charAt(0) == arr[j].charAt(0)) {
                    sayac++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            System.out.println(arr[i].charAt(0) + "=" + sayac);
        }
    }
}
