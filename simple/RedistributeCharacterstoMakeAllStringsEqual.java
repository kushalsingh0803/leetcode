package simple;

public class RedistributeCharacterstoMakeAllStringsEqual {

    class Solution {
        public boolean makeEqual(String[] words) {
            int[] charList = new int[26];

            for(String str : words){
                for(char c : str.toCharArray()){
                    charList[c - 'a']++;
                }
            }

            for(int i=0; i<26; i++){
                if(charList[i]%words.length != 0){
                    return false;
                }
            }
            return true;
        }

    }
}
