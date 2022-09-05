package trArray;

import java.util.Arrays;
import java.util.Scanner;

public class TR_Array_05 {
    public static void main(String[] args) {
        /*
            yazilan degerin array icerisinde arayan Java Kodu yaziniz.
            Array: [1551,1223,1443,1267,1789,1023,2020]
            Aranan Deger:2020       Beklenen Cikti:**True**
            Aranan Deger:2010       Beklenen Cikti :**False**
        */
        Scanner scan = new Scanner(System.in);
        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        System.out.print("Aradiginiz sayiyi giriniz : ");
        int arananSayi = scan.nextInt();
        int control = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arananSayi == arr[i]) {
                control = 1;
                break;
            }
        }
        if (control == 1) {
            System.out.println("**True**");
        } else {
            System.out.println("**False**");
        }
    }
}

