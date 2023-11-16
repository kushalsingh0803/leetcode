package easy;

import java.io.IOException;

public class MinimumRecolorsGetKConsecutiveBlackBlocks {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
         int result = MinimumRecolorsGetKConsecutiveBlackBlocks.minimumRecolors("WBBWWBBWBW",7);
         System.out.println(result);
    }

    public static int minimumRecolors(String blocks, int k) {
       int res = Integer.MAX_VALUE;
        int j =0;
        int wCount=0;
        for(int i =0; i<blocks.length();i++){
            if(blocks.charAt(i)=='W') wCount++;
            if(i-j+1==k){
                res=Math.min(wCount,res);
                if(blocks.charAt(j)=='W') wCount--;
                j++;
            }


        }

        return res;

     
    }
}
