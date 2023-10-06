package simple;

public class CheckIfaWordOccursAsPrefixofAnyWordSentence {

    public static void main(String[] args)
    {
        CheckIfaWordOccursAsPrefixofAnyWordSentence.Solution solution = new CheckIfaWordOccursAsPrefixofAnyWordSentence.Solution();
        System.out.println(solution.isPrefixOfWord("i love eating burger", "you"));

    }

    static class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {

            String[] wordList = sentence.split("\\s+");


            for (int i = 0; i < wordList.length; i++) {

                if (wordList[i].startsWith(searchWord)) {
                    return i+1;
                }
            }
            return -1;
        }
    }
}
