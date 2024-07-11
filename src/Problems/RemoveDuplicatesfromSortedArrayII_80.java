package Problems;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII_80 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2};
        int count = 0;

        for (int i : nums){
            if (count < 2 || i != nums[count-2]){
                nums[count++] = i;
            }
        }

        System.out.println(Arrays.toString(nums));


    }
}
