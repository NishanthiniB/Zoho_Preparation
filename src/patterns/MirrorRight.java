package patterns;

public class MirrorRight {
    public static void main(String[] args) {
        int n = 6;
        pattern(n);
    }

    static void pattern(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++) {
                System.out.print(" ");
            }
                for(int col=1; col<=row; col++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
