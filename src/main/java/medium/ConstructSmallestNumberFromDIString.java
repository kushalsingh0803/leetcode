package medium;

import java.io.IOException;

public class ConstructSmallestNumberFromDIString {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = ConstructSmallestNumberFromDIString.smallestNumber("IIIDIDDD");
        System.out.println(result);
    }

    public static String smallestNumber(String pattern) {

        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char ch = '1';
        for (int i = 0; i < pattern.length(); i++) {
            char cur = pattern.charAt(i);
            temp.append(ch);
            ch++;
            if (cur == 'I') {
                res.append(temp.reverse());
                temp = new StringBuilder();
            }
        }
        temp.append(ch);
        res.append(temp.reverse());
        return res.toString();
    }
}
