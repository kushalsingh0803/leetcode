package simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumIndexSumofTwoListsTest {


    static List<String[]> testCaseInputs = Arrays.asList(
            new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
            new String[] {"Shogun","Tapioca Express","Burger King","KFC"},
            new String[] {"Shogun","Tapioca Express","Burger King","KFC"}

    );
    static List<String[]> testCaseInputs2 = Arrays.asList(
            new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"},
            new String[] {"Piatti","Burger King","Hungry Hunter Steakhouse","Shogun"},
            new String[] {"KFC","Shogun","Burger King"}

    );

    static List<Boolean> testCasesOutput = Arrays.asList(
            false, false, false,true,true
    );

    @Test
    public void shouldExecuteAllValidCombinations(){
        for (int i=0;i<testCaseInputs.size();i++){
            MinimumIndexSumofTwoLists solution = new MinimumIndexSumofTwoLists();
            //  Assert.assertEquals(String.format("test case %d failed", i), testCasesOutput.get(i),  solution.solve(testCaseInputs.get(i)[0],testCaseInputs.get(i)[1]));
            System.out.println(Arrays.toString(solution.solve(testCaseInputs.get(i),testCaseInputs2.get(i))));
        }
    }
}