package Deneme;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
            Kullanicidan aldigimiz 8 elemanli arrayin icinde
            3 e bolunebilen sayi adedini yazdiran java code create ediniz
            (negatif sayilar da dahil olsun)
        */
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("sayi giriniz: ");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) count++;
        }
        System.out.println("Dizide uce bolunen sayi adedi :" + count);
    }
}