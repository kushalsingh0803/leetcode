package simple;

import java.util.ArrayList;
import java.util.List;

public class DivideStringIntoGroupsofSizek {


    public static void main(String[] args)
    {
        DivideStringIntoGroupsofSizek.Solution solution = new DivideStringIntoGroupsofSizek.Solution();
        System.out.println(solution.divideString("abcdefghij" ,3,'x'));

    }

    static class Solution {
        public String[] divideString(String s, int k, char fill) {

            List<String> wordList = new ArrayList<>();



            for ( int i =0;i<s.length();){

                if(i+k > s.length()){

                    String str = s.substring(i,s.length());

                    for(int j=0;j<i+k-s.length();j++){


                        str+=fill;
                    }

                    wordList.add(str);
                }else wordList.add(s.substring(i,i+k));
                i+=k;
            }


            String[] ans = new String[wordList.size()];
            int i = 0;
            for(String str : wordList) ans[i++] = str;
            return ans;
        }
    }
}
