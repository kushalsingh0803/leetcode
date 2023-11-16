package easy;

import java.io.IOException;
import java.util.*;

public class LastVisitedIntegers {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
     //   List<Integer> = LastVisitedIntegers.lastVisitedIntegers("eetcodes");
      //  System.out.println(result);
    }

    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> res = new ArrayList<>();
        List<Integer> number = new ArrayList<>();

        int prevVisit = 0;
        for(String word: words){
            if("prev".equals(word)){
                prevVisit++;
                res.add(0 <= number.size() - prevVisit ? number.get(number.size() - prevVisit) : -1);
            } else {
                prevVisit = 0;
                number.add(Integer.valueOf(word));
            }
        }

        return res;


    }
}
