package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CountPairsOfSimilarStrings {

    public static void main(String[] args) throws IOException {

        String[] testCaseInputs=new String[] {"aba","aabb","abcd","bac","aabc"};
        int result = CountPairsOfSimilarStrings.similarPairs(testCaseInputs);
        System.out.println(result);
    }

    public static  int similarPairs(String[] words) {
        int res = 0;


        for(int i=0;i<words.length-1;i++)
        {
            System.out.println(i);
            HashSet<Character> a = new HashSet<Character>();
            for(char c:words[i].toCharArray())
            {
               a.add(c);
            }
            List<Character> listA = new ArrayList<Character>(a);
            Collections.sort(listA);
            for(int j=i+1;j<words.length;j++)
            {

                System.out.println(j);
                HashSet<Character> b = new HashSet<Character>();
                for(char c:words[j].toCharArray())
                {
                    b.add(c);
                }
                List<Character> listB = new ArrayList<Character>(b);
                Collections.sort(listB);
                boolean pairFound = false;

                System.out.println(listA);
                System.out.println(listB);
                if( listA.equals(listB)) pairFound = true;

                if(pairFound)
                {
                    res++;
                }
            }
        }

        return res;

    }
}
