package simple;

public class ReplaceAllstoAvoidConsecutiveRepeatingCharacters {


    public static void main(String[] args)
    {
        ReplaceAllstoAvoidConsecutiveRepeatingCharacters.Solution solution = new ReplaceAllstoAvoidConsecutiveRepeatingCharacters.Solution();
        System.out.println(solution.modifyString("j?qg??b"));

    }

   static class Solution {
        public String modifyString(String s) {
            char[] charArray = s.toCharArray();
            char previous = 'a';


            for(int i = 0; i < s.length(); i++) {
                if(charArray[i] == '?') {

                    char prev = i>0 ? charArray[i-1] : charArray[i];
                    char next = i+1 < charArray.length ? charArray[i+1] : charArray[i];


                        if(previous == 'z') {
                            previous = 'a';
                        }

                    System.out.println(prev);
                    System.out.println(previous);
                    System.out.println(next);
                    while (previous == prev || previous == next ){
                        previous++;
                    }

                    charArray[i] = previous;

                }
            }
            return new String(charArray);
        }


    }
}
