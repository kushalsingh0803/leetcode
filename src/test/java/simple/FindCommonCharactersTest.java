package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindCommonCharactersTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[]{"bella","label","roller"},
            new String[]{"cool","lock","cook"}

    );

    static List<String> testCasesOutput = Arrays.asList(
            "abc", "aaaaabbbbb", "abd", "abd"
    );

    @Test
    public void shouldExecuteAllValidCombinations() {
        for (int i = 0; i < testCaseInputs.size(); i++) {
            FindCommonCharacters solution = new FindCommonCharacters();
            // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}