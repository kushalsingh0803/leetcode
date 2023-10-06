package simple;

public class MinimumNumberofOperationstoConvertTime {


    class Solution {
        public int convertTime(String current, String correct) {
            int total = 0;
            int currentMin = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3, 5));
            int correctMin = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3, 5));

            int diffMin = correctMin-currentMin;
            int result =0;

            result += diffMin / 60;
            diffMin = diffMin % 60;
            result += diffMin / 15;
            diffMin = diffMin % 15;
            result += diffMin / 5;
            diffMin = diffMin % 5;
            result +=diffMin;

            return result;

        }
    }
}
