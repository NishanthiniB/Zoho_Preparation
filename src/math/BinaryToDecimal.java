package math;

public class BinaryToDecimal {
    public static void main(String[] args) {
      String  binary ="11111011";
      int result = decimal(binary);
        System.out.println(result);
    }

    static int decimal(String binary){
        //1011 -> right to left ---> 1*2^0 + 1*2^1
        int decimal =0;
        int base=1;
        int length = binary.length();

        for(int i=length-1; i>=0; i--){
            if(binary.charAt(i)=='1'){
                decimal +=base;
            }
            base *=2;
        }
        return decimal;

    }
}
