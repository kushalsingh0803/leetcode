package easy;

import java.io.IOException;

public class CountDaysSpentTogether {


    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = CountDaysSpentTogether.countDaysTogether("08-15","08-18","08-16","08-20");
        System.out.println(result);
    }

     public static int[] daysInMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arrAliceOnDay = calculateDayOfYear(arriveAlice);
        int leaveAliceOnDay = calculateDayOfYear(leaveAlice);

        int arrBobOnDay = calculateDayOfYear(arriveBob);
        int leaveBobOnDay = calculateDayOfYear(leaveBob);

        int i = Math.min(leaveAliceOnDay, leaveBobOnDay) - Math.max(arrAliceOnDay, arrBobOnDay);

        return i < 0 ? 0 : i + 1;
       
    }

    public static int calculateDayOfYear(String obj){
        int month = Integer.parseInt(obj.substring(0, 2));;
        int day = Integer.parseInt(obj.substring(3, 5));;

        int totalDays = 0;
        while(month > 1){
            totalDays += daysInMonths[month - 2];
            month--;
        }
        return totalDays + day;
    }
}
