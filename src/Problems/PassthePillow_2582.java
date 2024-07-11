package Problems;

import java.util.Arrays;

public class PassthePillow_2582 {

    public static void main(String[] args) {

        int n = 4;
        int time = 5;

        int rounds = time /(n-1) ; // n-1 = 3 , t = 5, --- 5/4 = 1 -- rounds = 1 ;
        int ans = 0;

        if (rounds % 2 == 0){ // 1 % 2 = 1 --> 1 != 0
            ans = (1+time % (n-1)); //if true ans = (5+1 % (4-1)) -> 6%3 -> 0
        }else {
            ans = (n-time% (n-1)); // ans = (5-4 % (4-1) -> 1 % 3 -> 1
        }

        System.out.println(5%3);

    }

}
