package medium;

import easy.NumberSeniorCitizens;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortVowelsInString {

    public static void main(String[] args) throws IOException {

       // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = SortVowelsInString.sortVowels("lEetcOde");
        System.out.println(result);
    }

    public static String sortVowels(String s) {
        List<Character> vowelList = new ArrayList<>();
    StringBuilder res = new StringBuilder("");
        for( char c : s.toCharArray()){

            if (c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )  vowelList.add(c);
        }
        Collections.sort(vowelList);
        int k =0;
        for( char c : s.toCharArray()){

            if (c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ) {
                res.append(vowelList.get(k));
                k++;
            }
            else res.append(c);
        }

        return res.toString();
    }
}
