package simple;

public class CheckifBinaryStringHasatMostOneSegmentofOnes {

    class Solution {
        public boolean checkOnesSegment(String s) {
            if(s.length() == 1 && s.charAt(0) == '1'){
                return true;
            }
            return !(s.contains("10") && s.contains("01"));
        }
    }
}
