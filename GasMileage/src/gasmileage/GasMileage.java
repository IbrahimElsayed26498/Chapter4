
package gasmileage;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class GasMileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miles, gallons;
        double milesPerGallon, averageOfTrips = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        
        for(int i=0; i<3; i++){
            
            System.out.print("Enter miles : ");
            miles = input.nextInt();
            
            System.out.print("Enter gallons : ");
            gallons = input.nextInt();
            
            milesPerGallon = (double)miles/gallons;
            System.out.println("miles per gallons : " + milesPerGallon);
            
            averageOfTrips += milesPerGallon;
        }
        System.out.println("Total average miles per gallons : " + averageOfTrips);
       
            
        
    }
    
}
