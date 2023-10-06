package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AddStringsTest {
    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"45", "54"},
            new String[] {"567", "33"},
            new String[] {"56", "789"},
            new String[] {"3490", "3490"},
            new String[] {"6913259244",
                    "71103343"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            AddStrings solution = new AddStrings();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}