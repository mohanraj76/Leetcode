package Problems;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

        int[][] nums = {{1,2,3},{23,3,2,1}};

        int len = nums.length;

        int ans=0;

        for (int i=0; i<len; i++){
            int sum=0;
            for (int j =0; j< nums[i].length; j++){
             sum = sum+ nums[i][j];

            }
            if (sum>ans){
                ans = sum;
            }

        }

        System.out.println(ans);

    }
}
