package simple;

public class SplitStringinBalancedStrings {


    class Solution {
        public int balancedStringSplit(String s) {
         int result=0;
         int lCount =0;
         int rcount =0;
         for (int i=0;i<s.length();i++){

             if(s.charAt(i) == 'L') lCount++;
             else rcount++;

             if ( lCount == rcount){
                 lCount =0;
                 rcount =0;
                 result++;
             }
         }
            return result;
        }
    }
}
