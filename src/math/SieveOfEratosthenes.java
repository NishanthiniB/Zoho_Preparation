package math;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int num=16;
        sieve(num);
    }

    static void sieve(int num){
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false; //coz 0,1 are non prime

        for(int i=2; i*i<=num; i++){
            if(isPrime[i]){
                for(int multiples=i*i; multiples<=num; multiples+=i){
                    isPrime[multiples]=false;
                }
            }
        }

        for(int i=2; i<=num; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }

    }
}
