package Practice;

import java.util.Arrays;

public class zigzag_array {

    public static void main(String[] args) {


        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] c = new int[a.length + b.length];

        int a1 = 0;
        int b2 = 0;
        int c3 = 0;

        while (c3 < c.length) {

            if (a1 < a.length) {
                c[c3] = a[a1];
                c3++;
                a1++;
            }

            if (b2 < b.length) {
                c[c3] = b[b2];
                c3++;
                b2++;
            }

        }

        System.out.println(Arrays.toString(c));


    }

}
