package trArray;

import java.util.Arrays;

public class TR_Array_04 {
    public static void main(String[] args) {
        /*
            Asagidaki grid seklini yazan Java Kodunu yaziniz.
            Beklenen Cikti:
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
             0  0  0  0  0  0  0  0  0  0
        */
        int[][] mdArr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mdArr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

