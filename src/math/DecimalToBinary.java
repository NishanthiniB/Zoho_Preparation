package math;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num=251;
        int result = convertBinary(num);
        System.out.println(result);
    }

    static int convertBinary(int num){
        int ans=0;
        while(num!=0){
            int rem = num%2;
            num/=2;
            ans = ans*10+rem;
        }
        int result=0;
        while(ans!=0){
            int rem = ans%10;
            ans/=10;
            result=result*10+rem;
        }
        return result;
    }
}
