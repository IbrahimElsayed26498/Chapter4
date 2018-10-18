/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package righttriangle;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of right triangle : ");
        
        int x =in.nextInt();
        int y =in.nextInt();
        int z =in.nextInt();
        
        int large;
        if(x==y && x==z)
            System.out.println("Not side of right triangle!");
        else{
            if((x>y) && (x>z)){
                large=x;
                if(Math.sqrt(y*y+z*z)==x)
                    System.out.println("side of right triangle");
                else
                    System.out.println("Not side of right triangle!");
            }else if (y>x && y>z){
                large=y;
                if(Math.sqrt(x*x+z*z)==y)
                    System.out.println("side of right triangle");
                else
                    System.out.println("Not side of right triangle!");
            }else{
                large=z;
                if(Math.sqrt(x*x+y*y)==z)
                    System.out.println("side of right triangle");
                else
                    System.out.println("Not side of right triangle!");
            }
        }
        
    }
    
}
