package simple;

import java.util.HashMap;
import java.util.Map;

public class LongPressedName {

    public static void main(String[] args)
    {
        LongPressedName.Solution solution = new LongPressedName.Solution();
        System.out.println(solution.isLongPressedName("saeed" ,"ssaaedd"));
        String checkInStation = "Haridwar-12";
        String startDest = checkInStation.substring(0,checkInStation.indexOf('-'));
        int startTime = Integer.parseInt(checkInStation.substring(checkInStation.indexOf('-')+1));
        System.out.println(startDest);
        System.out.println(startTime);
    }

   static class Solution {
        public boolean isLongPressedName(String name, String typed) {

            if(name.equals(typed)) return true;
            if(typed.length() < name.length() || typed.length() == name.length()) return false;
            if(name.charAt(0) != typed.charAt(0) || name.charAt(name.length()-1) != typed.charAt( typed.length() - 1)) return false;

            int i = 0;
            int j = 0;
            int m = name.length();
            while(j<typed.length())
            {
                if(i<m && name.charAt(i) == typed.charAt(j))
                {
                    i++;
                }
                else
                {
                    if(j == 0 || typed.charAt(j) != typed.charAt(j-1))
                    {
                        return false;
                    }
                }
                j++;
            }

            return i==m;
        }
    }

}
