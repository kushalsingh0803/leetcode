package simple;

public class ReverseWordsStringIII {


    public static void main(String[] args)
    {
        ReverseWordsStringIII.Solution solution = new ReverseWordsStringIII.Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));

    }

    static class  Solution {
        public String reverseWords(String s) {
             StringBuilder result = new StringBuilder();
            String[] wordList = s.split("\\s+");
            for (int i = 0; i < wordList.length; i++) {
                result.append(reverseString(wordList[i]));
                result.append(" ");
            }

             return result.toString().trim();
        }



        }
    public static String reverseString(String word) {
        String reverseWord ="";

        int j = (word.length()-1);

        while(j >= 0){

            char tmp = word.charAt(j);

            reverseWord+=tmp;
            j--;
        }

        return reverseWord;
    }
    }
