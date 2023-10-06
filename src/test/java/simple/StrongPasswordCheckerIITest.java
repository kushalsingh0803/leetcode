package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StrongPasswordCheckerIITest {


    static List<String> testCaseInputs = Arrays.asList(
            new String ("IloveLe3tcode!"),
            new String ("Me+You--IsMyD1ream"),
            new String ("1aB!")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
            //Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}