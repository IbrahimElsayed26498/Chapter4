/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabularoutput;

/**
 *
 * @author ibrahim
 */
public class TabularOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("N   10*N    100*N   1000*n");
        for(int i=1;i<=5;i++){
            System.out.printf("%d   %d      %d     %d%n",i,(i*10),(i*100),i*1000);
        }
    }
    
}
