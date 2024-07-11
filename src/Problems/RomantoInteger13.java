package Problems;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger13 {

    public static void main(String[] args) {
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

        String s ="III";
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 100);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));

        for (int i=s.length()-2; i>=0; i--){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
            else {
                result += map.get(s.charAt(i));
            }
        }
        System.out.println(result);

    }

}
