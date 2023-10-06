package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordPatternTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"abba", "dog cat cat dog"},
            new String[] {"abba", "dog cat cat fish"},
            new String[] {"aaaa", "dog cat cat dog"},
            new String[] {"abab", "dog cat dog cat"}

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            WordPattern solution = new WordPattern();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
        }
    }
}