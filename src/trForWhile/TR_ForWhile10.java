package trForWhile;

public class TR_ForWhile10 {
    /*
        1'den 100'e kadar olan dogal sayilarin toplamini bulan programi yaziniz.
        OutPut:
        Sayilarin Toplami : 5050
     */
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 0; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("Sayilarin Toplami : " + toplam);
    }
}