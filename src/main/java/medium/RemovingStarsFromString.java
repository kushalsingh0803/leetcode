package medium;

import easy.FirstLettertoAppearTwice;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RemovingStarsFromString {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        String result = RemovingStarsFromString.removeStars("leet**cod*e");
        System.out.println(result);
    }

    public static String removeStars(String s) {

    int starCount = 0;

    StringBuilder res = new StringBuilder();
    for (int i = s.length()-1; i >=0; i--){

        if ( s.charAt(i) =='*')
            starCount++;

        else {

            if(starCount>0) starCount--;
            else res.append(s.charAt(i));
        }

    }

        return res.reverse().toString();
    }
}
