package simple;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAddresses {

    public int solve(String[] emails) {
        UniqueEmailAddresses.Solution solution = new UniqueEmailAddresses.Solution();
        return solution.numUniqueEmails(emails);
    }

    class Solution {
        public int numUniqueEmails(String[] emails) {
            List<String> uniqueEmailID = new ArrayList<>();

            for (int i =0; i<emails.length;i++){

                if (emails[i].indexOf('+')>=0){
                String name = (emails[i].substring(0,emails[i].indexOf('+'))).replace(".","");;

                   String domain =  emails[i].substring(emails[i].indexOf('@'));

                if(!uniqueEmailID.contains(name +domain)) uniqueEmailID.add(name +domain);
                }
                else {
                    String name = (emails[i].substring(0,emails[i].indexOf('@'))).replace(".","");;

                    String domain =  emails[i].substring(emails[i].indexOf('@'));

                    if(!uniqueEmailID.contains(name +domain)) uniqueEmailID.add(name +domain);
                }

            }

            return uniqueEmailID.size();
        }
    }
}
