package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountCommonWordsWithOneOccurrenceTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"leetcode","is","amazing","as","is"},
            new String[] {"b","bb","bbb"},
            new String[] {"a","ab"}

    );
    static List<String[]> testCaseInputs2 = Arrays.asList(
            new String[] {"amazing","leetcode","is"},
            new String[] {"a","aa","aaa"},
            new String[] {"a","a","a","ab"}

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            CountCommonWordsWithOneOccurrence solution = new CountCommonWordsWithOneOccurrence();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println((solution.solve(testCaseInputs.get(i),testCaseInputs2.get(i))));
        }
    }
}