package math;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N Number: ");
        int num = scanner.nextInt();
        int result=1;
        for(int i=1; i<=num; i++){
            result*=i;
        }
        System.out.println("Your N number of Factorial is------ "+result);
        scanner.close();

    }

}
