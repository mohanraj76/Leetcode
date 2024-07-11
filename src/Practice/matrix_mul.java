package Practice;

import java.util.Arrays;

public class matrix_mul {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6}};
        int[][] arr1 = {{1,2}, {6,7}, {4,1}};

        int rows1 = arr.length;
        int column1 = arr[0].length;
        int column2 = arr1[0].length;

        System.out.println(rows1);
        System.out.println(column1);


        int[][] neew = new int[rows1][column1];



        for (int i = 0; i <rows1 ; i++) {

            for (int j = 0; j < column2 ; j++) {

                int sum = 0;
                for (int k = 0; k < column1; k++) {
                    sum += arr[i][k] * arr1[k][j];
                }
                neew[i][j] = sum;

            }

        }


        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < column2; j++) {

                System.out.print(neew[i][j] + " ");
            }
            System.out.println();

        }

    }

}
