
package binarydecimal;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class BinaryDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        long Decimal=0;
        int Binary = input.nextInt();
        int length = String.valueOf(Binary).length();
        for(int i=0;i<length;i++){
            Decimal+=(Binary%10)*Math.pow(2,i);
            Binary/=10;
        }
        System.out.println("The Decimal value is : " + Decimal);
    }
    
}
