package simple;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberStringsAppearSubstringsWordTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[]{"a", "abc", "bc", "d"},
            new String[]{"a", "b", "c"},
            new String[]{"a", "a", "a"},
            new String[]{"a", "a", "c", "c", "b", "d", "d", "c", "a"}
    );

    static List<String> testCasesOutput = Arrays.asList(
            "abc", "aaaaabbbbb", "abd", "abd"
    );

    @Test
    public void shouldExecuteAllValidCombinations() {
        for (int i = 0; i < testCaseInputs.size(); i++) {
            NumberStringsAppearSubstringsWord solution = new NumberStringsAppearSubstringsWord();
            // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i), testCasesOutput.get(i)));
        }
    }
}