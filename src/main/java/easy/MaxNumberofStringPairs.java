package easy;

import Hackerrank.BalancedBrackets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNumberofStringPairs {


    public static void main(String[] args) throws IOException {

        String[] strAr1=new String[] {"cd","ac","dc","ca","zz"};
        int result = MaxNumberofStringPairs.maximumNumberOfStringPairs(strAr1);
        System.out.println(result);
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int res =0;

        List<String> list = new ArrayList<String>(Arrays.asList(words));
        while ( list.size()>0){
          String  temp = new StringBuilder(list.get(0)).reverse().toString();
          list.remove(0);
            System.out.println(temp);
            System.out.println(list);
            if(list.contains(temp)){
                System.out.println("fgfgfgfgf");
                res++;
            }
        }

        return res;
    }
}
