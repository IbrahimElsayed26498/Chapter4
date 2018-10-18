/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ckeckerbooard;

/**
 *
 * @author ibrahim
 */
public class Ckeckerbooard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0;i<4;i++){
            for(int j=0;j<8;j++)
                System.out.print("*");
            System.out.println();
            System.out.print(" ");
            for(int x=0;x<8;x++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
