package Practice;

public class armstrong_num {
    public static void main(String[] args) {

        int num = 407;
        int temp = num;
        int ans = 0;
        while(num > 0){
            int k = num%10;
            ans += k*k*k;
            num = num/10;
        }

        if (temp == ans){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
