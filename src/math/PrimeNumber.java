package math;

public class PrimeNumber {
    public static void main(String[] args) {
       int N = 3;

        System.out.println(isPrime(N));
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
