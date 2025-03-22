package math;

public class RevereseInteger {
    public static void main(String[] args) {
        int num=12345;
        int reverse=0;
        while(num!=0){
            int rem = num%10;
            reverse = reverse * 10 + rem; //0*10+5 == 5
            num/=10;
        }
        System.out.println(reverse);
    }
}
