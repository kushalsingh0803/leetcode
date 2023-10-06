package simple;

import java.util.ArrayList;
import java.util.List;

public class CheckifNumbersAreAscendinginSentence {


    public static void main(String[] args)
    {
        CheckifNumbersAreAscendinginSentence.Solution solution = new CheckifNumbersAreAscendinginSentence.Solution();
        System.out.println(solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));

    }


    static class Solution {
        public boolean areNumbersAscending(String s) {

            List<Integer> numberList = new ArrayList<>();

              for( String ch :s.split("\\s+")){

                  if(ch.charAt(0) > 48 && ch.charAt(0) < 58  ) numberList.add(Integer.parseInt(ch));
              }

              for ( int i =0;i<numberList.size()-1;i++){
                   if (numberList.get(i) >= numberList.get(i+1)) return false;
              }
         return true;
        }
    }
}
