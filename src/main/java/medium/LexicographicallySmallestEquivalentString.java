package medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LexicographicallySmallestEquivalentString {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = LexicographicallySmallestEquivalentString.smallestEquivalentString("hello","world","hold");
        System.out.println(result);
    }

    public static  String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] equichar = new int[26];
        StringBuilder res = new StringBuilder();
        for(int i=0;i<26;i++)
            equichar[i]=i;

        for(int i=0;i<s1.length();i++) {
            int x = equichar[s1.charAt(i) - 'a'];
            int y = equichar[s2.charAt(i) - 'a'];
            if (x < y) {
                equichar[y] = x;
                for (int j = 0; j < 26; j++) {
                    if (equichar[j] == y) equichar[j] = x;
                }
            } else if (x > y) {

            equichar[x] = y;
            for (int j = 0; j < 26; j++) {
                if (equichar[j] == x) equichar[j] = y;
            }
        }
        }
        for(int i=0;i<baseStr.length();i++)
            res.append((char)(equichar[baseStr.charAt(i)-'a']+'a'));
        return res.toString();


    }
}
