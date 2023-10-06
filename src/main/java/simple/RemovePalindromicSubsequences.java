package simple;

public class RemovePalindromicSubsequences {


    class Solution {
        public int removePalindromeSub(String s) {

            if (s.length()==0) return 0;
            else if ( isPalindrome(s)) return 1;
            else return 2;
        }

        boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            while(i < j) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
    }
}
    }