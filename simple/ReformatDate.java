package simple;

import java.util.Arrays;

public class ReformatDate {
    class Solution {
        public String reformatDate(String date) {
       String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            String[] splitDate = date.split("\\s+");
            String result = "";
            result = splitDate[2] + "-";

            int m= Arrays.asList(months).indexOf(splitDate[1]);


                if(m+1<10)
                    result+="0";

                result = result + Integer.toString(m+1) + "-";


               String day = splitDate[0].substring(0,splitDate[0].length()-2);
            if (day.length() ==1)  day="0"+day;
            result = result+day;

            return result;
        }
    }
}
