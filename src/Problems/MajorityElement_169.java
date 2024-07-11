package Problems;

import java.util.Arrays;

public class MajorityElement_169 {
    public static void main(String[] args) {

        int[] nums = {6,6,6,7,7}; // 2,3,3

        Arrays.sort(nums);
        int temp = 0;
        int count = 0;
        int k = 0;

        if(nums.length == 1){
//            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                count++;
            }else {
                if (count > temp) {
                    temp = count;
                    k = nums[i];
                    count = 0;
                }
            }

        }

        System.out.println(k);

    }
}
