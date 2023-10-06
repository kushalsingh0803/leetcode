package simple;

import java.util.HashSet;
import java.util.Set;

public class DecodetheMessage {


    public static void main(String[] args)
    {
        DecodetheMessage.Solution solution = new DecodetheMessage.Solution();
        System.out.println(solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));

    }

    static class Solution {
        public String decodeMessage(String key, String message) {

            char[] decodeChar = new char[26];
            Set<Character> prevCharList= new HashSet<>();
            prevCharList.add(' ');
            char c ='a';
            for ( char ch : key.toCharArray()){
                if(!prevCharList.contains(ch)) {
                    decodeChar[ch-'a'] = c;
                     c++;
                    prevCharList.add(ch);
                }

            }
            String result ="";
            for ( char ch : message.toCharArray()){
                 if (ch == ' ') result = result + " ";
                 else result = result + decodeChar[ch-'a'];
            }

            return result;
        }
    }
}
