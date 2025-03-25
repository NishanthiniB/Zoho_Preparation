package math;

public class SwapVariable {
    public static void main(String[] args) {
        int a=5;
        int b=50;
        a=a+b; //55
        b=a-b;
        a=a-b;
        System.out.println("Now a is: " + a);
        System.out.println("Now b is: " + b);
    }
}
