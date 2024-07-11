package Problems;

public class MinimumCommonValue_2540 {
    public static void main(String[] args) {
        int[] nums1 = {0,2,3,4};
        int[] nums2 = {1,2,4};

        int i = 0;
        int j = 0;

        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]){
            System.out.println(-1);
        }

        while (nums1.length > i && nums2.length > j){

            if (nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                System.out.println(nums1[i]);
                return;
            }

        }

    }
}
