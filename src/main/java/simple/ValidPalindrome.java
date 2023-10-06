package simple;

public class ValidPalindrome {


    public boolean solve(String s) {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        return solution.isPalindrome(s);
    }


    class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int startInd = 0;
            int endInd = s.length()-1;
            int asciiValueOfStart;
            int asciiValueOfEnd;


            while (startInd <= endInd)
            {
                asciiValueOfStart = s.charAt(startInd);
                asciiValueOfEnd = s.charAt(endInd);

                if(!isValidAlphaNumeric(asciiValueOfStart)){
                    startInd++;
                }
                if(!isValidAlphaNumeric(asciiValueOfEnd)){
                    endInd--;
                }
                if (isValidAlphaNumeric(asciiValueOfStart) && isValidAlphaNumeric(asciiValueOfEnd)){

                    if (asciiValueOfStart!=asciiValueOfEnd){
                        return false;
                    }

                        startInd++;
                        endInd--;

                }
            }

            return true;
        }
    }

    public boolean isValidAlphaNumeric(int ascii)
    {
        return (  (  (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57) ) );
    }
}
