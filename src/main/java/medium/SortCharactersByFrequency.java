package medium;

import java.io.IOException;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = SortCharactersByFrequency.frequencySort("cccaaa");
        System.out.println(result);
    }

    public static   String frequencySort(String s) {

        String res="";

        HashMap<Character,Integer> charFreq= new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(charFreq.containsKey(s.charAt(i))) charFreq.put(s.charAt(i), charFreq.get(s.charAt(i))+1);
            else charFreq.put(s.charAt(i),1);

        }
        List<Character> sortedChar= new ArrayList<>(charFreq.keySet());
        Collections.sort(sortedChar, (a,b) -> charFreq.get(b)-charFreq.get(a));

        for(int i=0;i<sortedChar.size();i++){

            for(int j=0; j<charFreq.get(sortedChar.get(i));j++){
                res+=sortedChar.get(i);
            }
        }

        return res;
    }
}
