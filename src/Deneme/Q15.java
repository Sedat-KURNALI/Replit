package Deneme;

public class Q15 {

    public static void main(String[] args) {
		/*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlar?n?n ayni olup olmad???n? kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int[] arr = {2, 6, 4, 8, 2, 6, 3};

        boolean ayniMi = false;

        if (arr[0] == arr[arr.length - 1])
            ayniMi = true;

        System.out.println("ilk ve son eleman ayni mi :" + ayniMi);
    }

}
