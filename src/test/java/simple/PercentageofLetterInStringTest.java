package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PercentageofLetterInStringTest {



    @Test
    public void shouldExecuteAllValidCombinations(){

        PercentageofLetterInString solution = new PercentageofLetterInString();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve("leetcode",'e'));
        System.out.println(solution.solve("roof",'o'));
        System.out.println(solution.solve("catch",'e'));
        System.out.println(solution.solve("foobar",'o'));
        System.out.println(solution.solve("jjjj",'k'));
        }

}