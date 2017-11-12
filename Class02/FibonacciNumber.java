package Solution.Class02;
import java.util.Arrays;

public class FibonacciNumber {
    public long fibonacciNumber(int K){

        long a = 0;
        long b = 1;
        if(K <= 0){
            return 0;
        }



        while(K > 1){
            long c = (long) (a + b);
            b = c;
            a = b;
            K--;
        }
        return b;
    }

    public static void main(String[] args){
        FibonacciNumber solution = new FibonacciNumber();
        //test case
        int K = 8;
        long number = solution.fibonacciNumber(K);
        System.out.println(number);
    }
}

