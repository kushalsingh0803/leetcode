package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FirstPalindromicStringinArrayTest {

    static List<String[]> testCaseInputs = Arrays.asList(
            new String[]{"abc","car","ada","racecar","cool"},
            new String[]{"notapalindrome","racecar"},
            new String[]{"def","ghi"}

    );

    static List<String> testCasesOutput = Arrays.asList(
            "abc", "aaaaabbbbb", "abd", "abd"
    );

    @Test
    public void shouldExecuteAllValidCombinations() {
        for (int i = 0; i < testCaseInputs.size(); i++) {
            FirstPalindromicStringinArray solution = new FirstPalindromicStringinArray();
            // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}