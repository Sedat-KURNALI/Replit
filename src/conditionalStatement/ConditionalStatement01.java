package conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement01 {
    /*
        Girilen sayinin pozitif,  negatif veya sifir olup olmadigini yazdirin Java Kodunu yaziniz.
        Test data : 21          Beklenen Cikti: Sayi Pozitif
        Test data :-15          Beklenen Cikti: Sayi Negatif
        Test data :0            Beklenen Cikti: Sayi Sifir
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int input = in.nextInt();
        if (input<0){
            System.out.println("Sayi Negatif");
        }else if (input>0){
            System.out.println("Sayi Pozitif");
        }else{
            System.out.println("Sayi Sifir");
        }
    }
}
