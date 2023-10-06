package simple;

public class MinimumMovestoConvertString {

    class Solution {
        public int minimumMoves(String s) {
            int i = 0;
            int result = 0;

            while (i < s.length()) {
                if (s.charAt(i) == 'X') {
                    i = i + 2;
                    result++;
                }
                i++;
            }

            return result;
        }
    }

}
