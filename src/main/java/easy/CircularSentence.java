package easy;

import medium.LexicographicallySmallestEquivalentString;

import java.io.IOException;

public class CircularSentence {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        boolean result = CircularSentence.isCircularSentence("eetcodes");
        System.out.println(result);
    }

    public static  boolean isCircularSentence(String sentence) {
        String[] wordList = sentence.split("\\s+");

        if (wordList.length ==1) {
             if (wordList[0].charAt(0)==wordList[0].charAt(wordList[0].length()-1)) return true;
             else return false;
        }
        for(int i =0;i<wordList.length;i++){
           if(i == wordList.length-1) {
               if (wordList[i].charAt(wordList[i].length() - 1) != wordList[0].charAt(0)) return false;
           }else {
               if (wordList[i].charAt(wordList[i].length() - 1) != wordList[i + 1].charAt(0)) return false;
           }
        }

        return true;


    }
}
