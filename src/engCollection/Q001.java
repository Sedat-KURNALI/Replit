package engCollection;

import java.security.KeyStore;
import java.util.*;

public class Q001 {

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
        System.out.println("bir cumle giriniz");
        int count = 1;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(scan.nextLine().replace(" ", "").split("")));
        Map<Integer, String> map = new TreeMap<>();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                if (list.get(i).equals(list.get(i + 1))) {
                    count++;
                } else {
                    map.put(count, list.get(i));
                    count = 1;
                }
            } else {
                if (list.get(list.size() - 2).equals(list.get(list.size() - 1))) {
                    count++;
                    map.put(count, list.get(i));
                } else {
                    map.put(count, list.get(i));
                }
            }
        }
        String abc = "";
        for (Map.Entry entry : map.entrySet()) {
            abc = (String) entry.getValue();
        }
        System.out.println("maximum occurring character is :" + abc);
    }
}

