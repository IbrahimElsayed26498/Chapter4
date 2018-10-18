/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculator;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SalaryCAlculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  hours;
        double hourlyRate, salary;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.print("Enter number of hours : ");
            hours = input.nextInt();
            
            System.out.print("Enter the hourly rate : ");
            hourlyRate = input.nextInt();
            
            salary = hourlyRate * hours;
            if (hours > 40){
                salary += (hours - 40 )*0.5;
            }
            
            System.out.println("the totla salary is : " + salary);
       
        }
            
            
    }
    
}
