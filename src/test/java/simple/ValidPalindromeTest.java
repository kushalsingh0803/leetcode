package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("A man, a plan, a canal: Panama"),
            new String ("race a car"),
            new String (" ")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            ValidPalindrome solution = new ValidPalindrome();
            Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
        }
    }
}