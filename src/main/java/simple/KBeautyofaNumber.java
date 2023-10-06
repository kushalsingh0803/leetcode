package simple;

import java.util.ArrayList;
import java.util.List;

public class KBeautyofaNumber {

    public int solve(int num, int k) {
        KBeautyofaNumber.Solution solution = new KBeautyofaNumber.Solution();
        return solution.divisorSubstrings(num,k);
    }


    class Solution {
        public int divisorSubstrings(int num, int k) {

            List<Integer> subsNumList = new ArrayList<>();
            String numString = String.valueOf(num);

            for ( int i =0;i < numString.length();i++){

                subsNumList.add(Integer.parseInt(numString.substring(i,i+k)));

                if ( ( numString.length() - i ) == k ) break;
            }
            int result = 0;

            for ( int j : subsNumList){


               if (j != 0) {
                   if (num % j == 0) result++;
               }
            }
            return result;
        }
    }
}
