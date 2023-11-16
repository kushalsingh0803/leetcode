package easy;

import java.util.*;

public class OddStringDifference {

    public String oddString(String[] words) {
        Map<String,Integer> patternCount=new LinkedHashMap<>();
        Map<String,String> wordPattern=new LinkedHashMap<>();
        String pattern ="";
        for(String word:words){
            pattern="";
            for(int i=0;i<word.length()-1;i++){
                char ch=word.charAt(i),ch1=word.charAt(i+1);
                pattern= pattern + (ch1-ch);
                pattern= pattern + "/";
            }
            patternCount.put(pattern,patternCount.getOrDefault(pattern,0)+1);
            wordPattern.put(word,pattern);

        }

        for(Map.Entry<String,Integer> abc: patternCount.entrySet()){
            if(abc.getValue()==1)
                pattern=abc.getKey();
        }
        for(Map.Entry<String,String> xyz : wordPattern.entrySet() ){

            if(xyz.getValue().equals(pattern))
                return xyz.getKey();
        }
        return "";
    }
}
