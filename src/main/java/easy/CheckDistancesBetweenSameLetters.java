package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CheckDistancesBetweenSameLetters {

    public static void main(String[] args) throws IOException {

        int[] testCaseInputs=new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean result = CheckDistancesBetweenSameLetters.checkDistances("aa",testCaseInputs);
        System.out.println(result);
    }

    public static boolean checkDistances(String s, int[] distance) {
        List<Character> chars = new ArrayList<>();

        for ( int i =0;i<s.length();i++){
            System.out.println("resefeeult");
            int val1=s.lastIndexOf(s.charAt(i));
            if(chars.contains(s.charAt(i))){
                System.out.println("refgfgfgfgsefeeult");
                System.out.println(val1);
                System.out.println(s.indexOf(s.charAt(i)));
                System.out.println(distance[s.charAt(i)-97]+1);
              //  System.out.println(s.charAt(i-distance[s.charAt(i)-97]-1));

                if((val1 - s.indexOf(s.charAt(i))) != (distance[s.charAt(i)-97]+1)) return false;
              //  if(s.charAt(i) != s.charAt(i-distance[s.charAt(i)-97]-1)) return false;
            }else chars.add(s.charAt(i));
        }


        return true;

    }
}
