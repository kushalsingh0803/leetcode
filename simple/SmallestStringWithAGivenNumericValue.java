package simple;

public class SmallestStringWithAGivenNumericValue {

    class Solution {
        public String getSmallestString(int n, int k) {
            char[] ch = new char[n];

            for ( int i =0;i<n;i++) ch[i] = 'a';

            k=k-n;

            while(k>0){
                if(k>25){
                    ch[n-1] += 25;
                    n--;
                    k=k-25;
                }
                else{
                    ch[n-1]+=k;
                    k=0;
                }

            }
            return String.valueOf(ch);
        }
    }

}
