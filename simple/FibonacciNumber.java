package simple;

public class FibonacciNumber {

    class Solution {
        public int fib(int n) {

            if( n==0) return 0;
            int first=0,second=1;
            int result=1;
            for(int i=1;i<n;i++)
            {
                result=first+second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}
