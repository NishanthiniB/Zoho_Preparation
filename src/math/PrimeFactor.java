package math;

public class PrimeFactor {
    public static void main(String[] args) {
        int num=49; // 2 2 3
        factors(num);
    }

    static void factors(int num){

        for(int i=2; i<num; i++){
            if(isPrime(i)){
                int x =i;
                while(num%x==0){
                    System.out.println("Prime Factors of: "+ num + " are: " + i );
                    x = x*i;
                }
            }
        }

    }

    static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        for(int i=5; i<=num; i+=6){
            if(num%i==0 || num%(i+2)==0){
                return true;
            }
        }
        return false;
    }
}
