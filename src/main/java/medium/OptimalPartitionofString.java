package medium;

import easy.MaxNumberofStringPairs;

import java.io.IOException;

public class OptimalPartitionofString {

    public static void main(String[] args) throws IOException {


        int result = OptimalPartitionofString.partitionString("oygwwncfgewspmqvbez");
        System.out.println(result);
    }

    public static int partitionString(String s) {

         int res =0;
        StringBuilder tmp = new StringBuilder();
         for ( char c : s.toCharArray()){

             System.out.println(tmp);
             if(tmp.indexOf(String.valueOf(c)) == -1){
        
               tmp.append(c);

             }else {

                 tmp.delete(0,tmp.length());

                 tmp.append(c);
                 res++;
             }


         }

         return tmp.length() > 0? res+1:res;
    }
}
