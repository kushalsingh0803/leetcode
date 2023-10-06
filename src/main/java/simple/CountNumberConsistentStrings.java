package simple;

public class CountNumberConsistentStrings {

    public int solve(String allowed, String[] words) {
        CountNumberConsistentStrings.Solution solution = new CountNumberConsistentStrings.Solution();
        return solution.countConsistentStrings(allowed,words);
    }

    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {

           int result = 0;

           for (int i =0;i<words.length;i++){
               boolean allCharFound = true;
               for ( int j = 0; j <words[i].length();j++){
                    if (!allowed.contains(Character.toString(words[i].charAt(j)))){
                        allCharFound = false;
                        break;

                    }

               }
               if (allCharFound) result++;

           }

           return result;
        }
    }
}
