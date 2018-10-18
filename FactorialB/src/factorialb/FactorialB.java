package factorialb;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class FactorialB {
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of terms : ");
        Scanner i = new Scanner(System.in);
        int number = i.nextInt();
        double e =1.0;
        for(int j=1;j<number;j++){
            e += 1.0/fact(j);
        }
        System.out.println("e = "+e);
    }
    
}
