package easy;

public class NumberValidClockTimes {
    public int countTime(String time) {

        int hour=1; int min =1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?') hour = 24;
        else if (time.charAt(0) == '?')  hour = time.charAt(1) - '0'<=3?3:2;
        else if (time.charAt(1) == '?')  hour = time.charAt(0) - '0'==2?4:10;

        if (time.charAt(3) == '?' && time.charAt(4) == '?') min = 60;
        else if (time.charAt(4) == '?') min = 10;
        else if (time.charAt(3) == '?') min = 6;


        return  hour*min;
    }
}
