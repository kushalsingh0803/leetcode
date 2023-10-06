package simple;

public class NumberofLinesToWriteString {

    class Solution {
        public int[] numberOfLines(int[] widths, String s) {

            int sum =0;
            int maxCount =0;
            int ans[] = new int[2];

            for ( int i =0; i <s.length();i++){

                char c = s.charAt(i);
                if(sum +widths[c-'a'] <101 )
                {
                    sum = sum +widths[c-'a'];
                }else{
                   sum =  widths[ c-'a'];
                    maxCount++;
                }

            }
            ans[0] = maxCount;
            ans[1] = sum;

            return ans;

        }
    }
}
