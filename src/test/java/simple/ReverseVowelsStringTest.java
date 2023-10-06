package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReverseVowelsStringTest {


    static List<String> testCaseInputs = Arrays.asList(
            new String ("hello"),
            new String ("leetcode"),
            new String ("hellokushal"),
            new String ("kushalpalsingh")

    );

    static List<String> testCasesOutput = Arrays.asList(
            "hello", "leetcode", "hellokushal","kushalpalsingh"
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ReverseVowelsString solution = new ReverseVowelsString();
            //   Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}