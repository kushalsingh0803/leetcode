package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountNumberConsistentStringsTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"ad","bd","aaab","baa","badab"},
            new String[] {"a","b","c","ab","ac","bc","abc"},
            new String[] {"cc","acd","b","ba","bac","bad","ac","d"}

    );

    static List<String> testCaseInputs2 = Arrays.asList(
            "ab", "abc", "cad"
    );

    static List<String> testCasesOutput = Arrays.asList(
            "fl", "fl", "flower",""
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            CountNumberConsistentStrings solution = new CountNumberConsistentStrings();
           // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i))
                    System.out.println(solution.solve(testCaseInputs2.get(i), testCaseInputs.get(i)));


        }
    }

}