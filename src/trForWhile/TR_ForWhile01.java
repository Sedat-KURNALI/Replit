package trForWhile;

import java.util.Scanner;

public class TR_ForWhile01 {
    /*
        Kullanicidan bir isim ve bir karakter girmesini isteyin, ardindan donguleri 
        kullanarak karakterin isimde kac kez tekrarlandigini kontrol edin.
        char ch1= 'a' ;
        String name =?John came late" 
        Expected Output: 
        Number of a = 2    
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim gir:");
        String name = scan.nextLine();

        System.out.println("bir karakter gir:");
        char ch1 = scan.nextLine().charAt(0);

        int sayac = 0;
        for (int i = 0; i < name.length(); i++) {
            if (ch1 == name.charAt(i)) {
                sayac++;
            }
        }
        System.out.println(" Number of a = " + sayac);
    }
}