package simple;

public class FirstBadVersion {

   /* boolean isBadVersion(int version);

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int leftIndex=0,rightIndex=n;
            int ans = -1;
            while(leftIndex<=rightIndex){
                int midIndex =leftIndex+(rightIndex-leftIndex)/2;
                if(isBadVersion(midIndex)) {
                    ans = midIndex;
                    rightIndex = midIndex - 1;
                }
                else
                    leftIndex=midIndex+1;
            }
            return ans;
        }
    }*/
}
