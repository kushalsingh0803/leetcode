package simple;

public class ReverseVowelsString {


    public String solve(String s) {
        ReverseVowelsString.Solution solution = new ReverseVowelsString.Solution();
        return solution.reverseVowels(s);
    }


    class Solution {
        public String reverseVowels(String s) {

            char[] ch = s.toCharArray();
            char tmp;
            int i =0;
            int j = ch.length-1;
            while (i<j){
                if ( isVowelChar(ch[i])){
                  tmp = ch[i];
                   if (isVowelChar(ch[j])){
                       ch[i] = ch[j];
                       ch[j] = tmp;
                       i++;
                       j--;
                   }
                   else {
                       j--;
                   }
                }
                else{
                    i++;
                }


            }

            return String.copyValueOf(ch);
        }
        public boolean isVowelChar ( int ascii){

                return (  ascii == 65 ||  ascii == 69  || ascii == 73 ||  ascii == 79  || ascii == 85 ||  ascii == 97  || ascii == 101 ||  ascii == 105  || ascii == 111  || ascii == 117);


        }
    }
}
