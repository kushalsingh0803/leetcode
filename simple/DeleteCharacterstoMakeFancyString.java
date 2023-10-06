package simple;

public class DeleteCharacterstoMakeFancyString {
    class Solution {
        public String makeFancyString(String s) {
            StringBuilder result = new StringBuilder();

            if(s.length()<3) return s;

            result.append(s.substring(0,2));
            for( int i=2;i<s.length();i++){
              if (s.charAt(i) != result.charAt(result.length()-1) || s.charAt(i) != result.charAt(result.length()-2) ) result.append(s.charAt(i));

            }

            return result.toString();
        }
    }
}
