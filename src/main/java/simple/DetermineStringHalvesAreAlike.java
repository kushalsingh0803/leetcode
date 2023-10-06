package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetermineStringHalvesAreAlike {


    public boolean solve(String s) {
        DetermineStringHalvesAreAlike.Solution solution = new DetermineStringHalvesAreAlike.Solution();
        return solution.halvesAreAlike(s);
    }

    class Solution {
        public boolean halvesAreAlike(String s) {

            int halfLength = s.length()/2;

            String firstHalf = s.substring(0,halfLength);
                    String secondHalf = s.substring(halfLength,s.length());


            Character[] vowel = {'a', 'e',  'i',  'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            List<Character> vowelList = new ArrayList<Character>();
            vowelList.addAll(Arrays.asList(vowel));
            int vowelInFirstHalf = 0;
            int vowelInSecondHalf = 0;
            for ( int i =0;i<firstHalf.length();i++){
                if (vowelList.contains(firstHalf.charAt(i))) vowelInFirstHalf++;
            }
            for ( int i =0;i<secondHalf.length();i++){
                if (vowelList.contains(secondHalf.charAt(i))) vowelInSecondHalf++;
            }

            return vowelInFirstHalf == vowelInSecondHalf;

        }
    }
}
