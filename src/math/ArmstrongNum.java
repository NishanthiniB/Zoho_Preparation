package math;

import java.util.Random;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Armstrong Number Game!!!!");
        for(int i=0; i<5; i++){
            int rn = random.nextInt(1000);
            System.out.println("\nIs " + rn + " an Armstrong number?");
            String userInput = sc.nextLine();
            boolean isArmstrongNumber = isArmstrong(rn);

            // Check user's guess
            if ((isArmstrongNumber && userInput.equalsIgnoreCase("yes")) ||
                    (!isArmstrongNumber && userInput.equalsIgnoreCase("no"))) {
                System.out.println("Correct! " + rn + (isArmstrongNumber ? " is an Armstrong number." : " is not an Armstrong number."));
            } else {
                System.out.println("Wrong! " + rn + (isArmstrongNumber ? " is indeed an Armstrong number." : " is not an Armstrong number."));
            }

        }


    }

    public static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
        int digits=String.valueOf(num).length(); //count digits
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,digits); //1
            num/=10;
        }
        return sum == originalNum;
    }
}
