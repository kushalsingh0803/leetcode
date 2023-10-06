package simple;

import java.util.List;

public class StudentAttendanceRecord {


    public boolean solve(String s) {
        StudentAttendanceRecord.Solution solution = new StudentAttendanceRecord.Solution();
        return solution.checkRecord(s);
    }

    class Solution {
        public boolean checkRecord(String s) {

         int absentCount =0;

         StringBuilder lateAttendance =new StringBuilder();

            for (int i = 0; i <s.length();i++){

                char c = s.charAt(i);


                if ( c == 'A') {
                    absentCount++;
                    lateAttendance.setLength(0);
                }
                else if ( c == 'L') {
                  if (lateAttendance.length() ==2)  return false;
                  else {
                      lateAttendance.append(c);
                  }
                }
                else lateAttendance.setLength(0);

                if (absentCount >= 2){
                    return false;
                }


            }

            return true;

        }
    }
}
