/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astriskssquare;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class AstrisksSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the side of the square : ");
        int size = input.nextInt();
        if (size == 1) {
            System.out.println("*");
        } else {

            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("*");
                for (int x = 0; x < size - 2; x++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
