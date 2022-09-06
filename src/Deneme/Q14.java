package Deneme;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output:   sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */

        String str = "Congratulations";
        // str=str.replaceAll("[oau]","i");
        System.out.println(str);
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        System.out.println();
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("a") || arr[i].equals("o") || arr[i].equals("u")) {
                reverse += "i";
            } else {
                reverse += arr[i];
            }
        }
        System.out.println(reverse); // sniitilitirgniC

    /*
        [...]: Accept ANY ONE of the character within the square bracket, e.g.,
        [aeiou] matches "a", "e", "i", "o" or "u".
        [.-.] (Range Expression): Accept ANY ONE of the character in the range, e.g.,
        [0-9] matches any digit; [A-Za-z] matches any uppercase or lowercase letters.
        [^...]: NOT ONE of the character, e.g., [^0-9] matches any non-digit.
        Only these four characters require escape sequence inside the bracket list: ^, -, ], \.
    */
    }
}