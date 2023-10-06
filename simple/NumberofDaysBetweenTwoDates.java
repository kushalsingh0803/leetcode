package simple;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class NumberofDaysBetweenTwoDates {


    public static void main(String[] args)
    {
        NumberofDaysBetweenTwoDates.Solution solution = new NumberofDaysBetweenTwoDates.Solution();
        System.out.println(solution.daysBetweenDates("2019-06-29","2019-06-30"));

    }

    static class Solution {
        public int daysBetweenDates(String date1, String date2) {
            try {
                SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                Date startDate = dtf.parse(date1);
                Date endDate = dtf.parse(date2);
                long timeDiff = Math.abs(startDate.getTime() - endDate.getTime());
                return (int) TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
    }
}
