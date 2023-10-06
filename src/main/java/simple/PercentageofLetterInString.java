package simple;

public class PercentageofLetterInString {


    public int solve(String s, char letter) {
        PercentageofLetterInString.Solution solution = new PercentageofLetterInString.Solution();
        return solution.percentageLetter(s,letter);
    }

    class Solution {
        public int percentageLetter(String s, char letter) {

             int countChar = 0;

             for ( int i = 0;i<s.length();i++){
                  if (s.charAt(i) == letter) countChar++;

            }

             return Math.round(countChar*100/s.length());
        }
    }
}
