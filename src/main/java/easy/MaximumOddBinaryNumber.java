package easy;

import medium.MinimumSuffixFlips;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MaximumOddBinaryNumber {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = MaximumOddBinaryNumber.maximumOddBinaryNumber("0101");
        System.out.println(result);
    }

    public static String maximumOddBinaryNumber(String s) {

      char[] ch = s.toCharArray();
         Arrays.sort(ch);
        StringBuilder res = new StringBuilder();
        res.append('1');
        for ( int i =0;i<ch.length-1;i++) res.append(ch[i]);

        return res.reverse().toString();
    }
}
