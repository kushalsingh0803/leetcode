package simple;

public class NumberofSegmentsinaString {

    public int solve(String s) {
        NumberofSegmentsinaString.Solution solution = new NumberofSegmentsinaString.Solution();
        return solution.countSegments(s);
    }

    class Solution {
        public int countSegments(String s) {
            if (s == null || s.trim().equals("")) {
                return 0;
            }
            return s.trim().split("\\s+").length;
        }
    }
}
