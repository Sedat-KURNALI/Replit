package engCollection;

import java.util.*;

public class Q001_1 {

    public static void main(String[] args) {
         /*
        Write a Java program to get a String from user as input and find
         the maximum occurring character in that string. (Ignore case sensitivity)
     input :
     Learning java is easy
     output:
     maximum occurring character is : a
         */
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int sayac = 1;
        String abc = "";
        System.out.println("bir cumle giriniz");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(scan.nextLine().replace(" ", "").split("")));
        Collections.sort(list);
        if (list.size() == 1) {
            System.out.println("maximum occurring character is :" + list.get(0));
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    if (list.get(i).equals(list.get(i + 1))) {
                        sayac++;
                    } else {
                        if (max <= sayac) {
                            max = sayac;
                            abc = list.get(i);
                        }
                        sayac = 1;
                    }
                } else {
                    if (list.get(i).equals(list.get(i - 1))) {
                        sayac++;
                        if (max <= sayac) {
                            max = sayac;
                            abc = list.get(i);
                        }
                    } else {
                        if (max <= sayac) {
                            max = sayac;
                            abc = list.get(i);
                        }
                    }
                }
            }
            System.out.println("maximum occurring character is :" + abc + " " + max);
        }
    }
}

















