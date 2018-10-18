//In the name of Allah, the Gracious, the Merciful
package largesttwonumber;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class LargestTwoNumber {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int large1,large2,temp,number;
        
        System.out.println("Enter numbers : ");
        large1 = input.nextInt();
        large2 = input.nextInt();
        
        if(large2 > large1){
            temp = large1;
            large1 = large2;
            large2 = temp;
            
        }
        
        for(int i=0; i<8;i++){
            number = input.nextInt();
            if(number > large1){
                large2 = large1;
                large1 = number;
            }else{
                if(number > large2)
                    large2 = number;
            }
            
        }
        
        System.out.println("first : "+large1);
        System.out.println("Second: "+large2);
    }
    
}
//Alhamdulillah