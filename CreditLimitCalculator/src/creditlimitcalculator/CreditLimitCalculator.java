/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditlimitcalculator;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class CreditLimitCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        Customer c1 = new Customer();
        
        int creditLimit;
        
        c1.setAccountNumber(input.nextInt());
        c1.setBeginningBalance(input.nextInt());
        c1.setCharges(input.nextInt());
        c1.setCredits(input.nextInt());
        creditLimit  = input.nextInt();
        if(c1.getBeginningBalance()+c1.getCharges()-c1.getCredits()>creditLimit){
            System.out.println("credit limit exceeded");
        }
        
        
    }
    
}
