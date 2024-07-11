package Problems;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {

        String[] arr = {"flower", "flower", "flower"};

        for (int i=0; i< arr.length; i++){
            String st1 = arr[i];
            String st2 = arr[i+1];
            for (int j=0; j<st1.length(); j++){
                if (st1.charAt(j) == st2.charAt(j)){
                    char ch = st1.charAt(i);
                    System.out.print(ch);
                }else {
                    System.out.println(" ");
                }
            }
        }

    }
}
