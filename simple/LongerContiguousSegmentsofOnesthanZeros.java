package simple;

public class LongerContiguousSegmentsofOnesthanZeros {

    class Solution {
        public boolean checkZeroOnes(String s) {

            int maxZeroCount =0;
            int maxOneCount = 0;
            int z = 0;
            int o = 0;
            for(int i =0;i<s.length();i++) {
                if (s.charAt(i) == '0') {
                    z++;
                    if (z >= maxZeroCount) maxZeroCount = z;
                } else {
                    z = 0;
                }
            }
                for(int i =0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    o++;
                    if(o>=maxOneCount) maxOneCount=o;
                }
                else{
                    o=0;
                }
            }

            return maxOneCount>maxZeroCount;
        }
    }
}
