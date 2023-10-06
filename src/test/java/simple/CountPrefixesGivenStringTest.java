package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountPrefixesGivenStringTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"a","b","c","ab","bc","abc"},
            new String[] {"a","a"},
            new String[] {"a","a","ab","abcd","abc","abrd","abb","aab"}

    );
    static List<String> testCaseInputs2 = Arrays.asList(
            new String ("abc"),
            new String ("aa"),
            new String ("abcd")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            CountPrefixesGivenString solution = new CountPrefixesGivenString();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i),testCaseInputs2.get(i)));
        }
    }
}