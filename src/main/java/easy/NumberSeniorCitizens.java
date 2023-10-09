package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSeniorCitizens {

    public static void main(String[] args) throws IOException {

        String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = NumberSeniorCitizens.countSeniors(strAr1);
        System.out.println(result);
    }

    public static int countSeniors(String[] details) {
        int res =0;
         for(String person : details){

             if(Integer.parseInt(person.substring(10,13)) > 60) res++;
         }

        return res;
    }
}
