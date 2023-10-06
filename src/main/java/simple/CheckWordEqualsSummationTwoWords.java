package simple;

public class CheckWordEqualsSummationTwoWords {


    public boolean solve(String firstWord, String secondWord, String targetWord) {
        CheckWordEqualsSummationTwoWords.Solution solution = new CheckWordEqualsSummationTwoWords.Solution();
        return solution.isSumEqual(firstWord,secondWord,targetWord);
    }

     class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

            String firstWordNumber = "";
            String secondWordNumber = "";
            String targetWordNumber = "";

            for ( int i =0; i<firstWord.length();i++){

                int number = (int)firstWord.charAt(i) - 97;
                firstWordNumber = firstWordNumber + String.valueOf(number);
            }
            for ( int i =0; i<secondWord.length();i++){

                int number = (int)secondWord.charAt(i) - 97;
                secondWordNumber = secondWordNumber + String.valueOf(number);
            }
            for ( int i =0; i<targetWord.length();i++){

                int number = (int)targetWord.charAt(i) - 97;
                targetWordNumber = targetWordNumber + String.valueOf(number);
            }


            return Integer.parseInt(firstWordNumber) + Integer.parseInt(secondWordNumber) == Integer.parseInt(targetWordNumber);

        }
    }

}
