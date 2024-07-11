package Practice;

public class factorial_num {
    public static void main(String[] args) {


        int i = 5;
        int ans = 1;
        while (i>0){
            ans*= i;
            i--;
        }
        System.out.println(ans);

    }
}
