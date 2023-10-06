package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class DisplayTableofFoodOrdersinaRestaurant {

    class Solution {
        public List<List<String>> displayTable(List<List<String>> orders) {
            List<List<String>> ans = new ArrayList<>();
            TreeMap<String, Integer> food_map = new TreeMap<>();
            TreeMap<Integer, TreeMap<String, Integer>> map = new TreeMap<>();
            for(List<String> order: orders) {
                String foodItem = order.get(2);
                food_map.put(foodItem, 0);
            }
            for(List<String> order: orders) {
                int no = Integer.parseInt(order.get(1));
                map.put(no, new TreeMap(food_map));

            }
            for(List<String> order: orders) {
                int no = Integer.parseInt(order.get(1));
                String food = order.get(2);

                TreeMap<String, Integer> mp = map.get(no);

                mp.put(food, mp.get(food) + 1);
                map.put(no, mp);

            }
            List<String> header = new ArrayList<>();
            header.add("Table");
            for(String key : food_map.keySet())
            {
                header.add(key);
            }
            ans.add(header);

            for(int key : map.keySet()){
                List<String> foodOrder = new ArrayList<>();
                String tableNo= String.valueOf(key);
                foodOrder.add(tableNo);

                TreeMap<String, Integer> mp = map.get(key);
                for(int val : mp.values())
                {
                    String s = String.valueOf(val);
                    foodOrder.add(s);
                }

                ans.add(foodOrder);
            }
return ans;
            }
        }
    }

