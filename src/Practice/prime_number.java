package Practice;

public class prime_number {
    public static void main(String[] args) {

        int num = 10;
        for (int i =2 ; i<=num; i++ ) {
            int count = 0;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count=1;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
