package easy;

import java.io.IOException;

public class DetermineifTwoEventsHaveConflict {

    public static void main(String[] args) throws IOException {

        // String[] strAr1=new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"};
        boolean result = DetermineifTwoEventsHaveConflict.haveConflict(  new String[] {"14:13","22:08"},  new String[] {"02:40","08:08"});
        System.out.println(result);
    }

    public static  boolean haveConflict(String[] event1, String[] event2) {
      Integer event1_start = Integer.valueOf(event1[0].replace(":", ""));
        Integer event1_end = Integer.valueOf(event1[1].replace(":", ""));
        Integer event2_start = Integer.parseInt(event2[0].replace(":", ""));
       Integer event2_end = Integer.parseInt(event2[1].replace(":", ""));

       if (event2_end < event1_start) return false;
        if (event1_end >= event2_start) return true;

        return false;

    }
}
