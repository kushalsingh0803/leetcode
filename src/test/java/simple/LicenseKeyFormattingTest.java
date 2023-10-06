package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LicenseKeyFormattingTest {

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){

        LicenseKeyFormatting solution = new LicenseKeyFormatting();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(solution.solve("5F3Z-2e-9-w",4));
        System.out.println(solution.solve("2-5g-3-J",2));
        System.out.println(solution.solve("2-5g-3-Jrg-rty-yg",5));


    }

}