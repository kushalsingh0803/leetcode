package medium;

import easy.StringIsAcronymWords;

import java.util.List;

public class MinTimetoCollectGarbage {


    public int solve(String[] garbage, int[] travel) {
        MinTimetoCollectGarbage.Solution solution = new MinTimetoCollectGarbage.Solution();
        return solution.garbageCollection(garbage,travel);
    }

    class Solution {
        public int garbageCollection(String[] garbage, int[] travel) {

            return calculateTimeForGCollect(garbage,travel,'M') + calculateTimeForGCollect(garbage,travel,'P') + calculateTimeForGCollect(garbage,travel,'G');
        }


        public int calculateTimeForGCollect(String[] g, int[] travel, Character gType){
            int totalTime = 0;
            int gTypeLast = -1;
            for(int i =0;i<g.length;i++){
                if(g[i].indexOf(gType)!=-1){
                    gTypeLast = i;
                }
            }
            if(gTypeLast ==-1) return 0;

            for( int i =0;i<=gTypeLast;i++){

                    totalTime+=getGCount(g[i],gType);
                  if(i-1 >= 0)  totalTime += travel[i-1];

            }
            return totalTime;
        }


        public int getGCount(String s, Character gType){
            int total = 0;
            for(int i=0;i<s.length(); i++){
                if(gType == s.charAt(i)){
                    total++;
                }
            }
            return total;
        }
    }
}
