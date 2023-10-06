package simple;

import java.util.*;

public class LastStoneWeight {

    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> stoneHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int stone : stones){
                stoneHeap.add(stone);
            }


            while(stoneHeap.size() > 1){
                int y = stoneHeap.remove();
                int x = stoneHeap.remove();
                int diff = y - x;
                if(diff > 0)  stoneHeap.add(diff) ;
            }

            if(stoneHeap.size()==1) return stoneHeap.poll();

            return 0;
        }
    }
}
