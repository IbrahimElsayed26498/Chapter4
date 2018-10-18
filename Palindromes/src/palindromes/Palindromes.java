//In the name of Allah, the Gracious, the Merciuful
package palindromes;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        //check if the number is 5 digit or not.
        boolean check;
        do{
            System.out.print("Enter the number : ");
            num = input.nextInt();
            if((num>99999)||(num<10000)){
                System.out.println("Wrong number\nThe number must be 5 digets");
                check = true;    
            }
            else
                check =false;
        }while(check);
        
        //check if the number is palindrome or not.
        int reverse;
        int number = num;
        reverse = (num%10)*10000;
        num/=10;
        reverse += (num%10)*1000;
        num/=10;
        reverse += (num%10)*100;
        num/=10;
        reverse += (num%10)*10;
        num/=10;
        reverse += (num%10);
        
        if(reverse == number )
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    
}
