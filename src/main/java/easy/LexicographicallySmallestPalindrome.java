package easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LexicographicallySmallestPalindrome {

    public String solve(String s) {
        LexicographicallySmallestPalindrome.Solution solution = new LexicographicallySmallestPalindrome.Solution();
        return solution.makeSmallestPalindrome(s);
    }

    class Solution {
        public String makeSmallestPalindrome(String s) {
            char[] arr = s.toCharArray();
            int l = arr.length;
            for ( int i =0;i<l/2;i++){

                if (arr[i]<arr[l-i-1]) arr[l-i-1] = arr[i];
                else
                     arr[i] = arr[l-i-1];
            }

            return new String(arr);
        }
    }
}
