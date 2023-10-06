package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {


    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            HashMap<String, Integer> map = new HashMap<>();

            for (String s : cpdomains) {
                String[] strs = s.split(" ");
                String domainName = strs[1];
                while (domainName.length() != 0) {
                    if (map.containsKey(domainName)) {
                        int c = map.get(domainName);
                        map.put(domainName, c + Integer.parseInt(strs[0]));
                    } else {
                        map.put(domainName, Integer.parseInt(strs[0]));
                    }

                    if (domainName.contains("."))
                        domainName = domainName.substring(domainName.indexOf('.') + 1);
                    else
                        break;
                }
            }

            List<String> result = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                result.add(Integer.toString(map.get(entry.getKey())) + " " + entry.getKey());

            }
            return result;
        }
    }
}
