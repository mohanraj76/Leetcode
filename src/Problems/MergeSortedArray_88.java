package Problems;

import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        for (int j = 0,i = m; j < n ; j++){
            nums1[i] = nums2[j];
            i++;
        }
        // 1,2,2,3,5,6
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i+1; j < nums1.length ; j++) {
                if (nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums1));


//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (j >= 0) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//
//        System.out.println(Arrays.toString(nums1));



    }
}
