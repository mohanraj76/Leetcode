package Problems;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2};

        int count =0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[count] != nums[i] ){
                count++;
                nums[count] = nums[i];
            }

        }

        System.out.println(count+1);

    }
}
