package simple;

public class NumberofLaserBeamsinaBank {

    class Solution {
        public int numberOfBeams(String[] bank) {
            int prevLaser = 0;
            int ans = 0;
            for ( String str : bank){
              int curLaser =0;
                 for ( char ch :str.toCharArray()){
                     if (ch =='1'){
                         curLaser++;
                     }
                 }
                 if(curLaser > 0){
                     ans = ans + curLaser* prevLaser;
                     prevLaser=curLaser;
                 }


            }

            return  ans;
        }
    }
}
