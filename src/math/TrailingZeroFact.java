package math;

public class TrailingZeroFact {
    public static void main(String[] args) {
        long num = 22;
        long zeros = trail(num);
        System.out.println(zeros);
    }

    static long trailZero(long num) {
        long result = 1;
        long count = 0;
        for (int i = 1; i <= num; i++) {
            result *= i; //120*6 ==720

        }
        System.out.println(result);
        while (result > 0) {
            long rem = result % 10;
            if (rem == 0) {
                count++;
            } else {
                break;
            }
            result /= 10;
        }

        return count;
    }

    //GIVEN NUM IS GREATER THAN 20 USE THIS LOGIC

    static long trail(long num){
        long result=0;
        for(int i=5; i<=num; i*=5){
            result=result+num/i;
        }
        return result;
    }
}
