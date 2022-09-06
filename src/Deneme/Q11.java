package Deneme;

public class Q11 {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int toplam1 = 0;
        for (int[] w : arr1) {
            for (int x : w) {
                toplam1 += x;
            }
        }
        System.out.println("ilk arrayin elemanlari toplami : " + toplam1);

        int toplam2 = 0;
        for (int[] each : arr2) {
            for (int y : each) {
                toplam2 += y;
            }
        }
        System.out.println("ikinci arrayin elemanlari toplami : " + toplam2);
        System.out.println("Tum arraylerin elemanlari toplami : " + (toplam1 + toplam2));


    }
}
