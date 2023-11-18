package easy;

import java.io.IOException;

public class CheckStringsCanbeMadeEqualWithOperationsI {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"hello","leetcode"};
        boolean result = CheckStringsCanbeMadeEqualWithOperationsI.canBeEqual("abcd","cdab");
        System.out.println(result);
    }

    public static  boolean canBeEqual(String s1, String s2) {


        if(s1.charAt(0) != s2.charAt(0)){
            if(s1.charAt(0) != s2.charAt(2) ) return false;
        }

        if(s1.charAt(1) != s2.charAt(1)){
            if(s1.charAt(1) != s2.charAt(3) ) return false;
        }

        if(s1.charAt(2) != s2.charAt(2)){
            if(s1.charAt(2) != s2.charAt(0) ) return false;
        }

        if(s1.charAt(3) != s2.charAt(3)){
            if(s1.charAt(3) != s2.charAt(1) ) return false;
        }
        return true;

    }
}
