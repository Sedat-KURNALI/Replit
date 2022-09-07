package conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement12 {
    /*
        Ugly Number:
        Girilen bir sayinin  ugly number olup olmadigini kontrol etmek icin bir Java programi yazin.
        Sayi sisteminde,  ugly number  sadece asal faktorleri 2, 3 veya 5 olan pozitif sayilardir.
        ilk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
        Test Data:13        Beklenen Cikti: ugly number  degildir
        Test Data:25        Beklenen Cikti: ugly number
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kontrol edilecek sayiyi giriniz : ");
        int sayi = sc.nextInt();
        int temp = sayi;
        for (int i = 1; i < sayi; i++) {
            if (temp % 2 == 0) {
                temp /= 2;
            }
            if (temp % 3 == 0) {
                temp /= 3;
            }
            if (temp % 5 == 0) {
                temp /= 5;
            }
            if (temp == 1) break;
        }
        if (temp == 1) {
            System.out.print("ugly number");
        } else {
            System.out.print("ugly number  degildir");
        }
    }
}
