package Practice;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {

        int[] arr ={5,4,3,2,1};

        for (int i = 0 ; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
