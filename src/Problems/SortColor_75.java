package Problems;

public class SortColor_75 {


    public static void main(String[] args) {

        int[] nums = {2, 3, 2, 3, 1, 0, 0};


//        class Solution {
//            public void sortColors(int[] nums) {
//                int n = nums.length;
//                int i=0, j=0, k=n-1;
//                if(n<3) {
//                    Arrays.sort(nums);
//                    return;
//                }
//                while(j<=k) {
//                    if(j<i || nums[j]==1){
//                        j++;
//                    }
//                    else if(nums[j] == 0) {
//                        swap(nums, i, j);
//                        i++;
//                    }
//                    else {
//                        swap(nums, j, k);
//                        k--;
//                    }
//                }
//            }
//            void swap(int nums[], int a, int b) {
//                int temp = nums[a];
//                nums[a]= nums[b];
//                nums[b] = temp;
//            }
//        }


//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));


//        int i = 0;
//
//        while (i < nums.length) {
//            int min = i;
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[min] > nums[j]  ) {
//                   min = j;
//                }
//            }
//            int temp = nums[min];
//            nums[min] = nums[i];
//            nums[i] = temp;
//            i++;
//        }
//
//        System.out.println(Arrays.toString(nums));

    }

}
