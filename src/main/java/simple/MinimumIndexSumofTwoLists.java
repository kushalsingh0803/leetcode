package simple;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumofTwoLists {

    public String[] solve(String[] list1, String[] list2) {
        MinimumIndexSumofTwoLists.Solution solution = new MinimumIndexSumofTwoLists.Solution();
        return solution.findRestaurant(list1,list2);
    }



    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {

            Map <String,Integer> list1Set = new HashMap<>();
             for ( int i =0; i < list1.length;i++){

                 list1Set.put(list1[i],i);
             }
                 int minSum = list1.length+list2.length;
            ArrayList<String> list = new ArrayList<>();
             for ( int j = 0;j<list2.length;j++){
                   if (list1Set.containsKey(list2[j])){
                       int tempSum = j + list1Set.get(list2[j]);
                        if (tempSum<minSum){
                            minSum = tempSum;
                            list.clear();
                            list.add(list2[j]);

                        }
                        else if( tempSum == minSum){
                            list.add(list2[j]);
                        }
                   }

             }

            String[] result = new String[list.size()];
            for(int i = 0; i < list.size(); i++){
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
