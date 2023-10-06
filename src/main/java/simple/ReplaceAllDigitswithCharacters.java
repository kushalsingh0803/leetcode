package simple;

public class ReplaceAllDigitswithCharacters {

    public String solve(String s) {
        ReplaceAllDigitswithCharacters.Solution solution = new ReplaceAllDigitswithCharacters.Solution();
        return solution.replaceDigits(s);
    }


    class Solution {
        public String replaceDigits(String s) {

       StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if ( c >= '0' && c <= '9'){
                char replaceChar = (char) (s.charAt(i-1)+ (c-'0'));
                if(replaceChar > 'z') result.append('z');
                else result.append(replaceChar);

            }
            else
                result.append(c);
        }
        return result.toString();
        }
    }
}
