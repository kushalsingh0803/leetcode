package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TwoStringArraysareEquivalentTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"ab", "c"},
            new String[] {"a", "cb"},
            new String[] {"abc", "d", "defg"}

    );
    static List<String[]> testCaseInputs2 = Arrays.asList(
            new String[] {"a", "bc"},
            new String[] {"ab", "c"},
            new String[] {"abcddefg"}


    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            TwoStringArraysareEquivalent solution = new TwoStringArraysareEquivalent();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i),testCaseInputs2.get(i)));
        }
    }
}