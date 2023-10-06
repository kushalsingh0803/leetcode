package simple;

import java.util.HashMap;

public class CountVowelSubstringsofaString {


    class Solution {
        public int countVowelSubstrings(String word) {
            HashMap<Character,Integer> vowel = new HashMap<>();
             int result =0;
            for( int i=0;i<word.length();i++){
                for ( int j=i;j<word.length();j++){

                    if (word.charAt(j)  =='a' || word.charAt(j)  =='e' || word.charAt(j)  =='i' || word.charAt(j)  =='o' || word.charAt(j)  =='u' ){
                        vowel.put(word.charAt(j),1);
                        if (vowel.size()>=5) result++;
                    }else

                    break;
                }
                vowel.clear();
            }

            return result;
        }
    }
}
