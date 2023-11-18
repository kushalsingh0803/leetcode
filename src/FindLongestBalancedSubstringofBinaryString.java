package easy;

import java.io.IOException;

public class FindLongestBalancedSubstringofBinaryString {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"hello","leetcode"};
        int result = FindLongestBalancedSubstringofBinaryString.findTheLongestBalancedSubstring("00111000");
        System.out.println(result);
    }

    public static  int findTheLongestBalancedSubstring(String s) {

        int zeroCount = 0;
        int oneCount = 0;
        int res =0;
        int i = 0;
        while (i < s.length()) {
            while (s.charAt(i) == '0') {
                zeroCount++;
                i++;
            }
            while (s.charAt(i) == '1') {
                oneCount++;
                i++;
            }
            res = Math.max(res, 2 *  Math.min(zeroCount, oneCount));
            zeroCount = 0;
            oneCount = 0;
        }
        return res;
    }
}
