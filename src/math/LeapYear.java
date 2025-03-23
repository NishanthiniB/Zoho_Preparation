package math;

public class LeapYear {
    public static void main(String[] args) {
     int year =1996;
        System.out.println(isLeapYear(year));
    }

    static boolean isLeapYear(int year){
        if(year%4==0){ //1996
            if(year%100==0){
                return year%400==0;
            }
            else{
                return true; //only divisible by 4;
            }
        }
        return false;
    }
}
