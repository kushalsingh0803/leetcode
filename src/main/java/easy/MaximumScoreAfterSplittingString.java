package easy;

import java.io.IOException;

public class MaximumScoreAfterSplittingString {


    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = MaximumScoreAfterSplittingString.maxScore("00");
        System.out.println(result);
    }
    public static  int maxScore(String s) {

        int res =0;
        int onesCount = 0;
        for(char ch:s.toCharArray())
        {
            if(ch == '1')
                onesCount++;
        }
        int leftZerosCount = 0;
        for(int i = 0;i<s.length()-1;i++)
        {
                if(s.charAt(i)== '0')
                {
                    leftZerosCount++;
                }
                else
                {
                    onesCount--;
                }

            res = Math.max(res, leftZerosCount + onesCount);
            }

        return res;

    }
}
