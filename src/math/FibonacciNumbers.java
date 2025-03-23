package math;

public class FibonacciNumbers {
    public static void main(String[] args) {
         int num=2;
        System.out.print("Print First 5 Fibonacci Numbers: ");
        fibonacci(num);
    }
    static void fibonacci(int n){
        if(n==0){
            return;
        }
        int[] fibNum = new int[n];
        fibNum[0] = 0;
        if(n>=2){
            fibNum[1]=1;
        }
        for(int i=2; i<n; i++){
            fibNum[i]=fibNum[i-1]+fibNum[i-2];
        }

        for(int i=0; i<n; i++){
            System.out.print(fibNum[i] + " ");
        }
        System.out.println();
    }
}
