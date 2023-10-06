package simple;

public class ShortestCompletingWord {

    class Solution {
        public String shortestCompletingWord(String licensePlate, String[] words) {


            int[] charFreg = new int[26];
            charFreg = getCharFreg(licensePlate);
            String res = null;

            for(String word : words) {
                int[] cnt = getCharFreg(word);
                if (equals(charFreg,cnt)) {

                    if (res == null || word.length() < res.length()) {
                        res = word;
                    }
                }
            }
            return res;





        }
       public int[] getCharFreg(String word) {
            int[] freq = new int[26];
            for(char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    freq[Character.toLowerCase(c)-'a']++;
                }
            }
            return freq;
        }

        public boolean equals(int[] target, int[] source) {
            for(int i = 0; i < 26; i++) {
                if(source[i] - target[i] < 0) return false;
            }
            return true;
        }

    }
}
