package Problems;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves_1509 {

    public static void main(String[] args) {

        int[] nums = {4,3,2,4};

        int size = nums.length;

        Arrays.sort(nums);
        if (nums.length != 1){
            nums[1] = 1;
        }
        nums[0] = 1;
        nums[size-1] = 1;

        Arrays.sort(nums);

        int ans = nums[size-1] - nums[0] ;

        System.out.println(ans);


    }
}
