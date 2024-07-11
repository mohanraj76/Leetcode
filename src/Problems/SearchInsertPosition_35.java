package Problems;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {

        int[] nums = {-1,1,3,4,6};
        int target = 0;
        int ans =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                System.out.println(i);
            }else {
                if (nums[i] == target-1 ){
                    ans = i+1;
                }
            }
        }
        System.out.println(ans);

    }
}
