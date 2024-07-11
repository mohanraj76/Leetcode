package Practice;

public class sum_of_digit {
    public static void main(String[] args) {
        int num = 10;
        int sum =0;
        for (int i = 0; i <= num; i++) {
            int m = 0;
            int a=i;
            if (a > 9){
                while (i>0){
                    int k = i%10;
                    m+=k;
                    i=i/10;
                }
            }
            sum += i+m;
            i =a;
        }
        System.out.println(sum);
    }
}
