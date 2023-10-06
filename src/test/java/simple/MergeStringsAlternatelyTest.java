package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeStringsAlternatelyTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"abc", "pqr"},
            new String[] {"ab", "pqrs"},
            new String[] {"abcd", "pq"}
    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            MergeStringsAlternately solution = new MergeStringsAlternately();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}