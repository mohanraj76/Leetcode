package Problems;

public class three_consecutive_odd_1550 {
    public static void main(String[] args) {

        int[] arr = {22,32,44,1,3,7,6,4};
        int count =0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0){
                count++;
            }else {
                count=0;
            }
            if (count == 3){
                break;
            }

        }

        System.out.println(count==3 ? true : false);

    }
}
