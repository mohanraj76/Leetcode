package Practice;

public class pointer {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 45, 5, 1};

        int pointer = 0;

        while (pointer < arr.length) {
            System.out.println(pointer + " = " + arr[pointer]);
            pointer++;
        }

    }
}
