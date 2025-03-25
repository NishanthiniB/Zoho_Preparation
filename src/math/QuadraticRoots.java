package math;

public class QuadraticRoots {
    public static void main(String[] args) {
         double a=2.3;
         double b=4;
         double c=5.6;

         double discriminant = b*b-4*a*c;

         if(discriminant>0){
             double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
             double root2 = (-b-Math.sqrt(discriminant)) / (2*a);
             System.out.println("ROOT 1: " + root1);
             System.out.println("ROOT 2: " + root2);
         }
         else if(discriminant==0){
             double root = -b/(2*a);
             System.out.println("ROOT: " + root);
         }
         else{
             double realPart =-b/(2*a);
             double imaginaryPart = Math.sqrt(-discriminant) / (2*a);
             System.out.println("Real Part: " + realPart);
             System.out.println("Imaginary Part: " + imaginaryPart);
         }


    }


}
