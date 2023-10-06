package simple;

public class SlowestKey {


    class Solution {
        public char slowestKey(int[] releaseTimes, String keysPressed) {
            int maxDuration = releaseTimes[0];
            char maxKey = keysPressed.charAt(0);
            for(int i = 1; i < releaseTimes.length; i++) {
                int diff = releaseTimes[i] - releaseTimes[i-1];
                if(diff > maxDuration) {
                    maxDuration = diff;
                    maxKey = keysPressed.charAt(i);
                } else if(diff == maxDuration) {
                    maxKey = (char)Math.max(maxKey, keysPressed.charAt(i));
                }
            }
            return maxKey;
        }
    }
}
