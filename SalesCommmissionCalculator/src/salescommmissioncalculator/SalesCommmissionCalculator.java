/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommmissioncalculator;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SalesCommmissionCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        double value = 0.0;
        int i=1;
        while(true){
            
            System.out.printf("item %d : ",i);
            value = input.nextDouble();
            if (value < 0)
                break;
            total += value;
            
            i++;
        }
        
        System.out.printf("the earnings = $%f%n", (200 +total*0.09) );
        
    }
    
}
