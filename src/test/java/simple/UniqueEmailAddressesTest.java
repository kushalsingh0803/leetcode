package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueEmailAddressesTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"},
            new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}

    );

    static List<String> testCasesOutput = Arrays.asList(
            "abc", "aaaaabbbbb", "abd", "abd"
    );

    @Test
    public void shouldExecuteAllValidCombinations() {
        for (int i = 0; i < testCaseInputs.size(); i++) {
            UniqueEmailAddresses solution = new UniqueEmailAddresses();
            // Assert.assertEquals(String.format("test case %d failed", i),testCasesOutput.get(i), solution.solve(testCaseInputs.get(i)));
            System.out.println(solution.solve(testCaseInputs.get(i)));
        }
    }
}