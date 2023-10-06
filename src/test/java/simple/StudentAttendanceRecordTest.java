package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentAttendanceRecordTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("PPALLP"),
            new String ("PPALLL"),
            new String ("PPALLAL"),
            new String ("PPALPLL"),
            new String ("PPALPPPPLLPPLLL")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            StudentAttendanceRecord solution = new StudentAttendanceRecord();
            //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}