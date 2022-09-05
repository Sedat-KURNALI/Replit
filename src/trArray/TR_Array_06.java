package trArray;

import java.util.Arrays;
import java.util.Scanner;

public class TR_Array_06 {
    public static void main(String[] args) {
        /*
            Aranan degerin Array icerisinde kacinci eleman oldugunu bulan Java Kodu yaziniz.
            Array: [12,15,43,23,56,76,78,90,77,43]
            Aranan deger:56
            Beklenen Cikti:
            56 sayisi arrayin 4. elemani
        */
        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        Scanner scan = new Scanner(System.in);
        System.out.print("Aradiginiz sayiyi giriniz : ");
        int arananSayi = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arananSayi == arr[i]) {
                System.out.println(arananSayi + " sayisi arrayin " + i + ". elemani");
                break;
            }
        }
    }
}

