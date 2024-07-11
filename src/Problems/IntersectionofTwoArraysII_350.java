package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII_350 {

    public static void main(String[] args) {

        int[] nums1 = {8,0,3};
        int[] nums2 = {0,0};
        int[] num3 = new int[nums1.length];



        for (int i = 0; i < nums1.length; i++) {
            num3[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    num3[i] = nums1[i];
                    nums2[j] = -1;
                    break;

                }
            }
        }

        ArrayList <Integer> fin = new ArrayList<Integer>();
        for (int i : num3){
            if (i != -1){
                fin.add(i);
            }
        }

        int[] num4 = new int[fin.size()];
        for (int i = 0; i < fin.size(); i++) {
            num4[i] = fin.get(i);
        }


        System.out.println(Arrays.toString(num4));

    }
}
