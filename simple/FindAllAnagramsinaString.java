package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

    class Solution {
        public List<Integer> findAnagrams(String s, String p) {


            int pLength = p.length();
            List<Integer> result = new ArrayList<Integer>();
            if(s.length() < pLength){
                return result;
            }

            int arr[] = new int[26];
            int main[] = new int[26];

            for(int i=0; i<pLength; i++){
                main[p.charAt(i)-'a']++;
            }

            int start = 0;
            for(int i=0; i<s.length(); i++){
                arr[s.charAt(i)-'a']++;
                if(i>=pLength-1){
                    if(Arrays.equals(arr, main)){
                        result.add(start);
                    }
                    arr[s.charAt(start)-'a']--;
                    start++;
                }
            }
            return result;
        }
    }
}
