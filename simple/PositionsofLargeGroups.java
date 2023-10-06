package simple;

import java.util.ArrayList;
import java.util.List;

public class PositionsofLargeGroups {


    public static void main(String[] args)
    {
        PositionsofLargeGroups.Solution solution = new PositionsofLargeGroups.Solution();
        System.out.println(solution.largeGroupPositions("abcdddeeeeaabbbcd"));

    }

    static class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> result =new ArrayList<>();
            int i = 0;
            int len = s.length();
            while(i < len){


                int j = 1;
                while(i+j < len && s.charAt(i) == s.charAt(i+j)){
                    j++;
                }

                if(j >= 3){

                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(i+j - 1);
                    result.add(list);
                }
                i = i+j;
            }
            return result;
        }
    }
}
