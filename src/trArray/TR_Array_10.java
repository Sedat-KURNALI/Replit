package trArray;

import java.util.Arrays;
import java.util.Scanner;

public class TR_Array_10 {
    public static void main(String[] args) {
        /*
            Bir String degiskeni cumlesi verildiginde, her sozcugu almak icin kod yazin
            ve tersine ters cevrilmis String'e atayin.
            Test Data:
            sentence --> "Java is fun"
            reversed --> "fun is Java"
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String sentence = input.nextLine();
        String reversed = "";
        String[] revArr = sentence.split(" ");
        for (int i = revArr.length - 1; i >= 0; i--) {
            reversed += revArr[i] + " ";
        }
        System.out.println(reversed);
        /*
            // sentence --> "Java is fun"
            // reversed --> "nuf si avaJ"
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();
            String reversed = "";
            for (int i = sentence.length() - 1; i >= 0; i--) {
                reversed += sentence.charAt(i);
            }
            System.out.println(reversed);
        */
    }
}

