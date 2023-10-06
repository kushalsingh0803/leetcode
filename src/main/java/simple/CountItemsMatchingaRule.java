package simple;

import java.util.List;

public class CountItemsMatchingaRule {


    public int solve(List<List<String>> items, String ruleKey, String ruleValue) {
        CountItemsMatchingaRule.Solution solution = new CountItemsMatchingaRule.Solution();
        return solution.countMatches(items,ruleKey, ruleValue);
    }

    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

            int result = 0;
            if ( ruleKey.equals("color")){
                for (int i =0;i < items.size();i++){
                    if(items.get(i).get(1).equals(ruleValue)) result++;
                }

            }
            if ( ruleKey.equals("type")){
                for (int i =0;i < items.size();i++){
                    if(items.get(i).get(0).equals(ruleValue)) result++;
                }

            }
            if ( ruleKey.equals("name")){
                for (int i =0;i < items.size();i++){
                    if(items.get(i).get(2).equals(ruleValue)) result++;
                }

            }

            return  result;

        }
    }


}
