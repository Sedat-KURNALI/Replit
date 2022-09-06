package Deneme;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasar?l?"
         with arrays change it to "CoookBasar?l?" and write changing array
         (String iniz: "GayetBasar?l?"  Diziyi "CoookBasar?l?" ye cevirin )

         */

        String str2 = "GayetBasarili";
        str2=str2.replace("Gayet", "Coook");

        String[] arr2 = {str2};

        System.out.println(str2);
        System.out.println(Arrays.toString(arr2));
    }

}
