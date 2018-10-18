package factorial;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = in.nextInt();
        int fact=1;
        for (int i=number;i>1;i--){
            fact *= i;
        }
        System.out.println("the factorial of the numebr is : " + fact);
    }
    
}
