package simple;

public class CapitalizetheTitle {

    class Solution {
        public String capitalizeTitle(String title) {
           String s = title.toLowerCase();
           StringBuilder result = new StringBuilder();
           for ( String word : s.split("\\s+")){

               if (word.length() <= 2){
                   result.append(word);
                   result.append(" ");
               }
               else{

                   result.append(word.substring(0, 1).toUpperCase());
                   result.append(word.substring(1));
                   result.append(" ");
               }

           }
           return result.toString().trim();
        }
    }
}
