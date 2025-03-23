package math;

public class PowerOfNumbers {

    public static void main(String[] args) {
       int a=2;
       int b=3;
        System.out.println(power(a,b));
    }

    static int power(int a, int b){
        if(b==0){
            return 1;
        }
        if(b<0){
            return 1/power(a, -b);
        }
        int result=1;
        for(int i=1; i<=b; i++){
            result *=a;
        }
        return result;
    }

}
