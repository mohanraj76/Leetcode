package Problems;

import java.util.Arrays;

public class RemoveElement_27 {

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val = 3 ;
        int i =0;
        int k =0;
        while (i < nums.length){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }

        System.out.println(k);

    }
}
