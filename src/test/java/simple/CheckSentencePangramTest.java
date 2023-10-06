package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CheckSentencePangramTest {

    static List<String> testCaseInputs = Arrays.asList(
            new String ("thequickbrownfoxjumpsoverthelazydog"),
            new String ("leeetcode"),
            new String ("thequickbrownfoxjumpsoverthelazydogleeetcode"),
            new String ("thequioxjumpsoverthelazydogleeetcode"),
            new String ("google")

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            true, true, false, true, true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            CheckSentencePangram solution = new CheckSentencePangram();
            //  Assert.assertEquals(String.format("test case %d failed", i),(Boolean) testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}