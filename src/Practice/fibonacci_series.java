package Practice;

public class fibonacci_series {
    public static void main(String[] args) {
       int num = 10;
       int a = 1;
       int b =0;
        for (int i = 1; i <= num; i++) {
            System.out.println(b);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

