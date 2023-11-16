package easy;

import java.io.IOException;
import java.util.Stack;

public class MinStringLengthAfterRemovingSubstrings {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = MinStringLengthAfterRemovingSubstrings.minLength("ABFCACDB");
        System.out.println(result);
    }

    public static  int minLength(String s) {
        Stack<Character> ss = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(!ss.isEmpty()) {
                if (ss.peek() == 'A' && s.charAt(i) == 'B') ss.pop();
                else if (ss.peek() == 'C' && s.charAt(i) == 'D') ss.pop();
                else  ss.push(s.charAt(i));
            }
            else ss.push(s.charAt(i));
        }
        return ss.size();


    }
}
