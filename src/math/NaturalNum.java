package math;

public class NaturalNum {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        while(num!=0){
            int rem =num%10;
            sum +=rem;
            num/=10;
        }
        System.out.print(sum);  //o(n)

        System.out.println((num)*(num+1) /2);
    }
}
