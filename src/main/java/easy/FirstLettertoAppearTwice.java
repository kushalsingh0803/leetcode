package easy;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FirstLettertoAppearTwice {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        char result = FirstLettertoAppearTwice.repeatedCharacter("lEetcOde");
        System.out.println(result);
    }

    public static char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();
        char c;
        for(int i=0; i<s.length();i++)
        {
            c= s.charAt(i);

            if(set.contains(c))
                return c;

            else
                set.add(c);
        }

        return 'a';
    }
}
