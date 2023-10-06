package simple;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray {

    class Solution {
        public List<String> stringMatching(String[] words) {

            List<String> result = new ArrayList<String>();
             for ( int i =0;i<words.length;i++){
                 for ( int j =0;j<words.length;j++){
                     if( i!=j){
                         if(words[j].contains(words[i])){
                             result.add(words[i]);
                             break;
                         }
                     }
                 }
             }

            return result;
        }
    }
}
