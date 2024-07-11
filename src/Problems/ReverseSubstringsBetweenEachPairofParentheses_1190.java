package Problems;


public class ReverseSubstringsBetweenEachPairofParentheses_1190 {
    public static void main(String[] args) {
        String s = "(u(love)i)";

        StringBuilder rs = new StringBuilder(s);

        int startind = rs.lastIndexOf("(");
        int endind = rs.indexOf(")",startind);

        while (startind != -1){

            StringBuilder ss = new StringBuilder(rs.substring(startind+1,endind));
            ss.reverse();
            rs.replace(startind,endind+1,ss.toString());
            startind = rs.lastIndexOf("(");
            endind = rs.indexOf(")", startind);
        }

        System.out.println(rs);



//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '('){
//
//            }
//        }
//
//        for (int i = s.length()-1; i >=0; i--) {
//            if (s.charAt(i) == ' ' || s.charAt(i) == ')' || s.charAt(i) == '(' ){
//                continue;
//            }else {
//                ans.append(s.charAt(i));
//            }
//        }
//
//        System.out.println(ans);




    }
}
