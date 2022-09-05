package trArray;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TR_Array_07 {
    public static void main(String[] args) {
        /*
           Array i ARRAYLIST e ceviren ve sonra Java Kodunu yaziniz.
           Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
           Beklenen Cikti:
           [Python, JAVA, PHP, Perl, C#, C++]
        */
        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}

