/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int largest, number;
        Scanner input = new Scanner(System.in);
        
        largest = input.nextInt();
        
        for(int i=1;i<10;i++){
            number = input.nextInt();
            if(number > largest )
                largest = number;
        }
        System.out.println("the largest number is : " + largest);
    }
    
}
