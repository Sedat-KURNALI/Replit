import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        for (int i = 1; i <= 5; i++) // 5 kez say? isteme  kontrolu
        {

            System.out.print("Bir say? giriniz : ");

            int sayi = scan.nextInt();

            if (sayi > 5 && sayi < 10) {

                continue;

            }

            toplam += sayi;

        }

        System.out.println("girdiginiz sayilarin toplam? :" + toplam);
    }
}


