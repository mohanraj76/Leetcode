package Practice;

public class palindrome {
    public static void main(String[] args) {

        int num = 11211;
        int temp =num;
        int rev = 0;
        while (num>0) {

            int k = num%10;
            rev = rev*10 + k;
            num = num/10;

        }

        if (temp == rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
