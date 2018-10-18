//بسم الله الرحمن الرحيم
//فكرة البرنامج بنختبر أن أى ضلعين يكونوا أكبر  من الضلع الثالث
package triangle;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int side1,side2,side3;
        System.out.println("Enter sides of triangle : ");
        Scanner input=new Scanner(System.in);
        
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        
        if(((side1+side2)<side3)||((side1+side3)<side2) || ((side2+side3)<side1) )
            System.out.println("It's not sides of triangles");
        else
            System.out.println("it's sides of triangle");
    }
    
}
