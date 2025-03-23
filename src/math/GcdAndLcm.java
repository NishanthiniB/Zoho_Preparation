package math;

public class GcdAndLcm {

    public static void main(String[] args) {
         int a=12;
         int b=18;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return Math.abs((a*b)/gcd(a,b));
    }

}
