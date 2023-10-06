package simple;

public class CrawlerLogFolder {

    class Solution {
        public int minOperations(String[] logs) {
         int result =0;
         int i =0;
         while ( i<logs.length){
             if ( logs[i].equals("../")) result--;
             else if ( logs[i].equals("./"));
             else result++;

             i++;
             if (result <0) result= 0;
         }

         return result;
        }
    }
}
