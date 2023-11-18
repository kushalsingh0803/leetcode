package easy;

import java.io.IOException;

public class VerifyingAlienDictionary {

    public static void main(String[] args) throws IOException {

         String[] strAr1=new String[] {"hello","leetcode"};
        boolean result = VerifyingAlienDictionary.isAlienSorted(strAr1,"hlabcdefgijkmnopqrstuvwxyz");
        System.out.println(result);
    }

    public static boolean isAlienSorted(String[] words, String order) {

        int[] orderRank=new int[26];
        for(int i=0;i<order.length();i++){
            orderRank[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length - 1;i++){
            String currWord = words[i];
            String nextWord = words[i+1];

            int len = Math.min(currWord.length(),nextWord.length());

            if(len!= currWord.length() && len == nextWord.length() && currWord.startsWith(nextWord)){
                return false;
            }

            for(int l=0;l<len;l++){
                if(orderRank[currWord.charAt(l)-'a'] > orderRank[nextWord.charAt(l)-'a']){

                    return false;
                }

               if(orderRank[currWord.charAt(l)-'a'] < orderRank[nextWord.charAt(l)-'a']) {
                   break;
               }

            }
        }

        return true;
    }
}
