package math;

public class SquareRoot {
    public static void main(String[] args) {
        int num=25;

        int sqrt=1;
        while(sqrt*sqrt<=num){
            sqrt++;
        }
        System.out.println(sqrt-1);
    }
}
