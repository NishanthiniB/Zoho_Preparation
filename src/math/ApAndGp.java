package math;

import javax.sound.midi.Sequence;

public class ApAndGp {
    public static void main(String[] args) {
        arithmeticProgression(2,3,5);
        computeGP(3,2,5);
        int[] sequences = {3,6,12,24,48};
        double[] sequence = {3,6,12,24,48};
        System.out.println(commonDiff(sequences));
        System.out.println(commonRatio(sequence));
    }

    static void arithmeticProgression(int firstTerm, int commonDiff, int noOfTerm){
        System.out.print("Arithmetic Progression (AP):");
        int sum=0;
        for(int i=0; i<noOfTerm; i++){
            int apTerm=firstTerm+i*commonDiff;
            sum +=apTerm;
            System.out.print(apTerm+ " ");
//            System.out.println();

        }
        System.out.println();
        System.out.println("SUM OF AP TERMS: " + sum);
        System.out.println();
    }
    public static void computeGP(int firstTerm, double commonRatio, int numberOfTerms) {
        System.out.print("Geometric Progression (GP):");
        double sum=0;
        for (int i = 0; i < numberOfTerms; i++) {
            double gpTerm = firstTerm * Math.pow(commonRatio, i); // Calculate the n-th term
            sum+=gpTerm;
            System.out.print(gpTerm + " ");

        }
        System.out.println();
        System.out.println("SUM OF GP TERMS: " + sum);
        System.out.println(); // New line after printing all terms
    }

    static int commonDiff(int[] sequence){
        if(sequence.length<2){
            System.out.println("Not enough term to find cd!!");
        }
        int cd = sequence[1] - sequence[0];
        for(int i=1; i<sequence.length; i++){
            if(sequence[i]-sequence[i-1]!=cd){
               return 0;
            }
        }
        return cd;
    }

    static double commonRatio(double[] sequence){
        if(sequence.length<2){
            System.out.println("Not enough term to find cr!!");
        }
        double cr = sequence[1] / sequence[0]; //6/3=2
        for(int i=1; i<sequence.length; i++){
            if(sequence[i]/sequence[i-1]!=cr){
                return 0.0;
            }
        }
        return cr;
    }
}
