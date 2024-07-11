package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CrawlerLogFolder_1598 {
    public static void main(String[] args) {

        String[] logs = {"d1/", "d2/", "../", "d21/", "./"}; // ../ -> remove lastly added  // ./ -> remains same
//        String[] ans = new String[logs.length];
//        int count = 0;
//        int finans =0;
//        for (int i = 0; i < logs.length; i++) {
//            if (logs[i] == "./"){
//                continue;
//            }else if (logs[i] != "../" ){
//                ans[i] = logs[i];
//                finans++;
//            }else {
//                ans[i-1] = null;
//                count++;
//            }
//        }
//        int cc =0;
//        for(int i =0; i<ans.length; i++){
//            if(ans[i] != null){
//                cc++;
//            }else{
//                continue;
//            }
//        }

        int count = 0;

        for (String log : logs) {

            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                if (count == 0) {
                    continue;
                } else {
                    count--;
                }
            } else {
                count++;
            }

        }
        System.out.println(count);

    }
}
