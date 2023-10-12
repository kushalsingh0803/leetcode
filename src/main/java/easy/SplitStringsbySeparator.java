package easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SplitStringsbySeparator {


    public static void main(String[] args) throws IOException {

         List<String> testCaseInputs = Arrays.asList(
                new String ("$easy$"),
                new String ("$problem$"),
                new String ("$probleeem$"));
        List<String> result = SplitStringsbySeparator.splitWordsBySeparator(testCaseInputs, '$');
       System.out.println(result);
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
      List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for( String word : words) {
            sb.append(word);
            sb.append(separator);
        }
        System.out.println(sb);
        String[] res = sb.toString().split(Pattern.quote(String. valueOf(separator)));
        for ( int i =0;i<res.length;i++){
          if(res[i].trim().length() > 0) {

              result.add(res[i].trim());
          }

        }
        System.out.println(result.size());
        return result;

    }

}
