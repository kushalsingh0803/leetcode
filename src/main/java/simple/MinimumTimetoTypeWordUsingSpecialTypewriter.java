package simple;

public class MinimumTimetoTypeWordUsingSpecialTypewriter {

    class Solution {
        public int minTimeToType(String word) {

            int result =0;

            char prevChar = 'a';

            for ( int i =0;i<word.length();i++){

                result+= Math.min(26-Math.abs(word.charAt(i)-prevChar),Math.abs(word.charAt(i)-prevChar));
                prevChar = word.charAt(i);
            }

            return  result +word.length();

        }
    }
}
