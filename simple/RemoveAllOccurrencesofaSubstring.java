package simple;

public class RemoveAllOccurrencesofaSubstring {


    public static void main(String[] args)
    {
        RemoveAllOccurrencesofaSubstring.Solution solution = new RemoveAllOccurrencesofaSubstring.Solution();
        System.out.println(solution.removeOccurrences("aabababa", "aba"));

    }


   static  class Solution {
        public String removeOccurrences(String s, String part) {
         Boolean c = true;
            while (c){
                if(!s.contains(part)){
                    c= false;
                }else s=s.replaceFirst(part,"");
                System.out.println(s);
            }
            return s;
        }
    }
}
