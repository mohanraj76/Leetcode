package Practice;

import java.util.Arrays;

public class sample {

    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7};

        Solution sss = new Solution();
        System.out.println(sss.findMedianSortedArrays(nums1, nums2));


    }

}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        System.arraycopy(nums2, 0, nums1, nums1.length - nums2.length, nums2.length);


        Arrays.sort(nums1);
        if (nums1.length % 2 != 0) {
            int ind = nums1.length / 2; // if 11 = 5(index)
            return nums1[ind];
        } else {
            int mid = nums1.length / 2; // if 10 = 5 -> index-> 5-1 = 4
            return (double) (nums1[mid - 1] + nums1[mid]) / 2;
        }
    }
}
