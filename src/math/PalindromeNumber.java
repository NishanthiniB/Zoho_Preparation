package math;

public class PalindromeNumber {
    public static void main(String[] args) {
       int num=3234;
        System.out.println(palindrome(num));
    }
    static boolean palindrome(int num){

           //323 --> palindrome

        int originalNum= num;
        int ans = 0;
        while(num!=0){
            int rem=num%10;
            num/=10;
            ans=ans*10+rem;
        }
        return originalNum==ans;
    }
}
