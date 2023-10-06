package simple;

public class FirstPalindromicStringinArray {


    public String solve(String[] words) {
        FirstPalindromicStringinArray.Solution solution = new FirstPalindromicStringinArray.Solution();
        return solution.firstPalindrome(words);
    }


    class Solution {
        public String firstPalindrome(String[] words) {

            for ( int i =0;i<words.length;i++){

                if (isPalindrome(words[i])) return words[i];
            }
        return "";
        }


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

        public boolean isValidAlphaNumeric(int ascii)
        {
            return (  (  (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57) ) );
        }
    }



}
