package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {

        int[] nums = {1};

        int ans =0;

        for (int i = 0; i < nums.length; i++) {
            if (i+1 != nums.length && nums[i] == nums[i+1] ){
                i++;
            }else {
                ans = nums[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
