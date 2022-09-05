package trArray;

import java.util.Arrays;

public class TR_Array_01 {
    public static void main(String[] args) {
        /*
            Karisik verilen sayilari  ve kelimeleri  siralayan   Java kodunun yaziniz.
            not: Test datadaki degerleri kullaniniz.
            Test Data:
                [1232, 1134,2345,1022]
                [Java, Python, PHP, C#, C Programming, C++]
            Beklenen Cikti:
                [1022,1134,1232,2345]
                [C Programming, C#, C++, Java, PHP, Python]
        */
        String[] str = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        int[] sayi = {1232, 1134, 2345, 1022};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));
    }
}

